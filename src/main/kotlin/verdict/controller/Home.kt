package verdict.controller

import verdict.model.BusinessList
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.client.RestTemplate
import javax.servlet.http.HttpServletRequest
import org.springframework.http.HttpEntity
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpMethod
import org.springframework.http.MediaType
import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.web.servlet.ModelAndView
import java.util.HashMap


@Controller
class HtmlController {
    private val accessToken = "v5_EQxtkFOgZ0yysNs36qHLBEcVgZmK-EpibMYplDPk-EM6QWqN143XlahFDBTkIOBIBLMoSvHXw6uKDYEwf-OcYMvgfkTRPIHuH0U_4Ts33fephSaMrdrsiw_vpW3Yx"

    @RequestMapping("/", method = arrayOf(RequestMethod.GET))
    fun index(model: Model): String {
        model["title"] = "Welcome to Verdict"
        return "index"
    }

    @RequestMapping("/search", method = arrayOf(RequestMethod.POST), consumes = arrayOf(MediaType.APPLICATION_FORM_URLENCODED_VALUE))
    fun search(request: HttpServletRequest): ModelAndView {
        val url = "https://api.yelp.com/v3/businesses/search?term=" + request.getParameter("cuisine") + "&location=" + request.getParameter("location")
        val restTemplate = RestTemplate()
        val headers = HttpHeaders()
        headers.contentType = MediaType.APPLICATION_JSON
        headers.set("Authorization", "Bearer $accessToken")
        val entity = HttpEntity("parameters", headers)
        val result = restTemplate.exchange(url, HttpMethod.GET, entity, String::class.java)
        val mapper = ObjectMapper()
        val businessList = mapper.readValue(result.body, BusinessList::class.java)
        var businesses = businessList.businesses
        val params = HashMap<String, Any>()
        params["business"] = businesses.take(3)
        return ModelAndView("search", params)
    }
}