package verdict.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HtmlController {

    @GetMapping("/")
    fun blog(model: Model): String {
        model["title"] = "Welcome to Verdict"
        return "index"
    }

}

@RestController
@RequestMapping("/rest")
class HomeController {
    fun index() = "This is home for Ibk!"

    @RequestMapping("/next")
    fun next() = "Welcome to next page :)"
}