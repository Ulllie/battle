package ulllie.repository

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories

@SpringBootApplication
@EnableJdbcRepositories
open class SpringDataJdbcApplication

fun main(args: Array<String>) {
    runApplication<SpringDataJdbcApplication>(*args)
}