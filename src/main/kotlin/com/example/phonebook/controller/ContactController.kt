package com.example.phonebook.controller

import com.example.phonebook.model.Contact
import com.example.phonebook.service.ContactService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/contacts")
class ContactController(private val contactService: ContactService) {

    @PostMapping
    fun createContacts(@RequestBody contact: Contact): Contact = contactService.create(contact)

    @GetMapping
    fun fetchAllContacts(): List<Contact> = contactService.findAll()

    @GetMapping("/{name}")
    fun findByName(@PathVariable name: String): Contact? = contactService.findByName(name)

    @DeleteMapping("/{name}")
    fun delete(@PathVariable name: String) = contactService.delete(name)

}