package verdict

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class VerdictApplication

fun main(args: Array<String>) {
    runApplication<VerdictApplication>(*args)
}
