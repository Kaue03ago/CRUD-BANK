package com.example.banco.services

import com.example.banco.model.Account
import com.example.banco.repository.RepositoryAccount
import org.springframework.stereotype.Service

@Service
class ServiceAccount (private val repositoryAccount: RepositoryAccount){


    fun registerAccount(account: Account): Account{
        if(repositoryAccount.existsByCPF(account.CPF)){
            throw IllegalArgumentException("CPF already registered in an account")
        }
        return repositoryAccount.save(account)
    }
}