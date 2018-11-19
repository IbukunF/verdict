package controller

import java.time.Instant
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/")
class HomeController {
    fun index() {
        return("This is home for Ibk!")
    }

    @RequestMapping("/next")
    fun next() = "Welcome to next page :)"
}