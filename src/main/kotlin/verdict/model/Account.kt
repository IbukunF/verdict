package verdict.model

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonProperty
import org.hibernate.annotations.NaturalId
import javax.persistence.*

import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

@Entity
@Table(name = "account")

data class Account(@Column(name = "email", nullable = false)
                   var email: String,

                   @Size(min = 8)
                   @get:JsonIgnore
                   @set:JsonProperty
                   var password: String? = null,

                   var firstName: String,
                   var lastName: String)
{

    @Id
    @GeneratedValue
    var id: Long? = null
}

annotation class Table(val name: String)
