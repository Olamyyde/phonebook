package com.example.phonebook.service

import com.example.phonebook.model.Contact
import com.example.phonebook.repository.ContactRepository
import org.springframework.stereotype.Service


@Service
class ContactService(private val repository: ContactRepository) {
    fun create(contact: Contact): Contact = repository.save(contact)
    fun delete(name: String) = repository.deleteByName(name)
    fun findAll(): List<Contact> = repository.findAll()
    fun findByName(name: String): Contact? = repository.findByName(name)
}
