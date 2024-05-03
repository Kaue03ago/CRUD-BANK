package com.example.banco.controllers;


import com.example.banco.model.Account;
import com.example.banco.services.ServiceAccount;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bank")
public class ControllerAccount(private val serviceAccount: ServiceAccount){


    @PostMapping("/register")
    fun registerAccount(@RequestBody @Valid account:Account): ResponseEntity<Account>{
        return ResponseEntity(serviceAccount.registerAccount(account), HttpStatus.CREATED)

    }


}
