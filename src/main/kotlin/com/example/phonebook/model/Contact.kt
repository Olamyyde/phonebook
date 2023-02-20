package com.example.phonebook.model

import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Contact (
        @Id val name: String,
        val phoneNumber: String,
        val address: String
    )
