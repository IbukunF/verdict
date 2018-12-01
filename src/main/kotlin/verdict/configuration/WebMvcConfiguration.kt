package verdict.configuration

import org.springframework.boot.convert.ApplicationConversionService.configure
import org.springframework.context.annotation.Configuration
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.SessionAttributes
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer
import org.verdict.kotlin.configure

@Configuration
@Controller
@SessionAttributes("authorizationRequest")

class WebMvcConfiguration : WebMvcConfigurer {

    override fun addViewControllers(registry: ViewControllerRegistry) = configure(registry) {
        addViewController("/login").setViewName("login")
    }

    private fun addViewController(s: String): Any {

    }

    private fun configure(registry: ViewControllerRegistry, any: Any) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}