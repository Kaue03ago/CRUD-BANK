package com.example.banco.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.validation.constraints.Digits
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import java.time.LocalDate

@Entity(name = "account")
data class Account (

    @Id
    @GeneratedValue
    val id: Long,

    @field: NotBlank
    @field: NotNull
    @field: Size(min = 3, max = 75)
    @Column
    var name: String,

//    @field: NotBlank
//    @field: NotNull
      @Digits(integer = 11, fraction = 0)
//    @Column
    var CPF: Long,


    @Column
    var dateBirth: LocalDate



)