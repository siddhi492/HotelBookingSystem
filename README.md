🏨 Hotel Booking System

Hotel Booking System is a web-based application built with Spring Boot, Spring MVC, and Hibernate (JPA) for seamless hotel room reservation and management. It provides a user-friendly interface for customers to search and book rooms, and an admin panel to manage hotels, rooms, and bookings. The system uses MySQL for data persistence and follows an MVC architecture with RESTful APIs and JSP-based views.
✅ Features
User registration and login

Search and book hotel rooms

Admin panel for managing hotels and rooms

View and manage bookings

RESTful API support (tested with Postman)

🧰 Technology Used

Backend:Java, Spring Boot, Spring MVC

ORM	Hibernate (Spring Data JPA)

Frontend:JSP, HTML, CSS

Database:MySQL

Build Tool:Maven

Server:Embedded Apache Tomcat

API Testing:Postman

📬 Postman
All RESTful endpoints (e.g., login, register, book room, view bookings) are tested using Postman. Sample requests include:

POST /api/register

POST /api/login

GET /api/rooms/available

POST /api/bookings

GET /api/admin/bookings
