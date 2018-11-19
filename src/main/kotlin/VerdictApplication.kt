import controller.HomeController
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@EnableAutoConfiguration
@Configuration
class VerdictApplication {
    @Bean
    fun controller() = HomeController()
}

fun main(args: Array<String>) {
    SpringApplication.run(VerdictApplication::class.java, *args)
}
