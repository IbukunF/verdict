package verdict.repository

import org.springframework.data.jpa.repository.JpaRepository

import org.verdict.model.Account
import verdict.model.Account


interface AccountRepository : JpaRepository<Account, Long> {

    fun findByUsername(username: String): Account?

}

interface JpaRepository<T, U> {

}

