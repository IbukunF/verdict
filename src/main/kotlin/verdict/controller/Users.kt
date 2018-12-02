package verdict.controller

import org.springframework.http.MediaType
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import verdict.model.User
import verdict.repository.UserRepository
import javax.servlet.http.HttpServletRequest
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping






@Controller
class UserController {
    @Autowired
    private val repository: UserRepository? = null

    val allUsers: Iterable<User>
        @RequestMapping(path = arrayOf("/all"), method = arrayOf(RequestMethod.GET))
        @ResponseBody
        get() = repository!!.findAll()

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
    fun create_account(request: HttpServletRequest, model: Model): String {
        val email = request.getParameter("email")
        val firstName = request.getParameter("fname")
        val lastName = request.getParameter("lname")
        val pword = request.getParameter("password")
        println(email)
        println(firstName)
        println(lastName)
        println(pword)

        val new = User(email, pword, firstName, lastName)
        repository!!.save(new)

        model["title"] = "Thanks for signing up. Use the form below to log in to your account"
        return "login"
    }
}
