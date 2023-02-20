Phone Book System

The Phone Book System is a simple application built with Kotlin and Spring Boot that allows users to manage contacts. It provides functionalities to create, read, update and delete contacts.
Features

    Fetch all created contacts
    Create a contact
    Get a contact
    Delete a contact

Installation

    Clone the repository: git clone https://github.com/YOUR-USERNAME/phone-book-system.git
    Navigate to the project directory: cd phone-book-system
    Build the Docker image: docker build -t phone-book-system .
    Run the Docker container: docker run -p 8080:8080 phone-book-system

Usage

After running the Docker container, you can access the API via http://localhost:8080/contacts.

The following endpoints are available:

    GET /contacts: Fetch all contacts
    GET /contacts/{id}: Get a contact by ID
    POST /contacts: Create a new contact
    PUT /contacts/{id}: Update an existing contact
    DELETE /contacts/{id}: Delete a contact

To create a contact, make a POST request to /contacts with a JSON payload in the following format:

json

{
"name": "John Doe",
"phoneNumber": "123-456-7890",
"address": "123 Main St, Anytown USA"
}

To update a contact, make a PUT request to /contacts/{id} with a JSON payload in the following format:

json

{
"name": "Jane Smith",
"phoneNumber": "987-654-3210",
"address": "456 Elm St, Anytown USA"
}
# phonebook
