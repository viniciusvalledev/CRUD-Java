<h1 align="center">CRUD Java PostgreSQL</h1>

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java">
  <img src="https://img.shields.io/badge/PostgreSQL-4169E1?style=for-the-badge&logo=postgresql&logoColor=white" alt="PostgreSQL">
  <img src="https://img.shields.io/badge/JDBC-API-blue?style=for-the-badge" alt="JDBC">
  <img src="https://img.shields.io/badge/License-MIT-green.svg" alt="License">
</p>

> Robust system developed in pure Java using the DAO (Data Access Object) pattern to manage complete CRUD (Create, Read, Update, Delete) operations integrated with a PostgreSQL relational database.

---

## Table of Contents

* [About the Project](#about-the-project)
* [Architecture & Technologies](#architecture--technologies)
* [Folder Structure](#folder-structure)
* [Prerequisites](#prerequisites)
* [How to Run the Project](#how-to-run-the-project)
* [Features](#features)
* [Author](#author)

---

## About the Project

This project aims to demonstrate best backend development practices using **Java Standard Edition** and data persistence with **native JDBC**. It manages **Supplier** entities, enabling a complete flow of data manipulation in a secure, modular, and object-oriented way.

---

## Architecture & Technologies

The project adopts a layered architecture to ensure separation of concerns:

| Layer / Component | Description |
| :--- | :--- |
| **Model** (`model/`) | Contains the entity classes (POJOs) representing the application data. |
| **DAO** (`dao/`) | Responsible for data persistence and direct communication with the database via SQL. |
| **Connection** (`crud/`) | Centralized connection factory to manage sessions with the DBMS. |
| **Main** (`crud/`) | Application entry point for console tests. |

* **Language:** Java (JDK 8+)
* **Database:** PostgreSQL
* **Driver:** PostgreSQL JDBC Driver (`42.7.5`)

---

## Folder Structure

```text
CRUD-Java/
├── lib/
│   └── postgresql-42.7.5.jar  # JDBC connection driver
├── src/
│   ├── crud/
│   │   ├── ConnectionFactory.java # Database connection manager
│   │   └── Main.java              # Main executable
│   ├── dao/
│   │   └── FornecedorDAO.java     # Database queries and persistence logic
│   └── model/
│       └── Fornecedor.java        # Domain entity
├── .gitignore
├── .classpath
└── .project
