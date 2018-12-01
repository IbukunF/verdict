package verdict.repository

import org.springframework.data.jpa.repository.JpaRepository

import verdict.model.Account


interface AccountRepository : JpaRepository<Account, Long> {

    fun findByEmail(email: String): Account?

}

//interface JpaRepository<T, U> {
//
//}

