package verdict.model

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonProperty
import javax.persistence.*
import javax.validation.constraints.Size


@Entity
data class User(@Column(name = "email", nullable = false, unique = true)
                   var email: String,

                   @Size(min = 8)
                   @get:JsonIgnore
                   @set:JsonProperty
                   var password: String? = null,

                   var firstName: String,
                   var lastName: String)
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long? = null
}
