package verdict

import verdict.controller.HomeController
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class VerdictApplication {
//    @Bean
//    fun controller() = HomeController()
}


fun main(args: Array<String>) {
    runApplication<VerdictApplication>(*args)
}
