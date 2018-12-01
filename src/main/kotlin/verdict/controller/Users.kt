package verdict.controller

import org.springframework.http.MediaType
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.servlet.ModelAndView
import verdict.model.Account
import verdict.repository.AccountRepository
import javax.servlet.http.HttpServletRequest


@Controller
class UserController {

    @RequestMapping("/login", method = arrayOf(RequestMethod.GET))
    fun login(model: Model): String {
        model["title"] = "Log in to access your Verdict Account"
        return "login"
    }

    @RequestMapping("/signup", method = arrayOf(RequestMethod.GET))
    fun signup(model: Model): String {
        model["title"] = "Sign up for a Verdict Account"
        return "signup"
    }

    @RequestMapping("/signup", method = arrayOf(RequestMethod.POST), consumes = arrayOf(MediaType.APPLICATION_FORM_URLENCODED_VALUE))
    fun create_account(request: HttpServletRequest, repository: AccountRepository): String {
        val email = request.getParameter("email")
        val first_name = request.getParameter("fname")
        val last_name = request.getParameter("lname")
        val pword = request.getParameter("password")
        return "index"
    }
}