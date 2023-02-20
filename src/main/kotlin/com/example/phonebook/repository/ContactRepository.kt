package com.example.phonebook.repository

import com.example.phonebook.model.Contact
import org.springframework.data.jpa.repository.JpaRepository

interface ContactRepository: JpaRepository<Contact, String> {
    fun findByName(name: String): Contact?
    fun deleteByName(name: String)
}