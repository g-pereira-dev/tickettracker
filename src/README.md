# 🎫 Ticket Tracker API

A RESTful API developed with **Java** and **Spring Boot** for managing IT support tickets. This project was built to demonstrate proficiency in backend architecture, database persistence, and clean code principles.

## 🚀 Technologies
- **Java 17**
- **Spring Boot 3**
- **Spring Data JPA**
- **PostgreSQL** (via Docker)
- **Maven**

## 📋 Features (CRUD)
The API supports full lifecycle management of IT tickets:
- `GET /api/tickets`: Retrieve all tickets.
- `GET /api/tickets/{id}`: Fetch a specific ticket by its unique ID.
- `POST /api/tickets`: Create a new ticket with title, description, and status.
- `PUT /api/tickets/{id}`: Update existing ticket information.
- `DELETE /api/tickets/{id}`: Remove a ticket from the system.

## 🛠️ How to Run the Project

1. **Database Setup**: Ensure Docker is installed and running. Start the PostgreSQL container:
docker run --name postgres-ticket -p 5432:5432 -e POSTGRES_DB=ticket_db -e POSTGRES_USER=postgres -e POSTGRES_PASSWORD=root -d postgres