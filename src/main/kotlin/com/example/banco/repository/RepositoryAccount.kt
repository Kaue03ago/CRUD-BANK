package com.example.banco.repository

import com.example.banco.model.Account
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface RepositoryAccount : JpaRepository <Account, Long> {

    fun existsByCPF(CPF: Long): Boolean

}