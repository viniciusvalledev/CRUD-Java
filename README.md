<h1 align="center">CRUD Java PostgreSQL</h1>

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java">
  <img src="https://img.shields.io/badge/PostgreSQL-4169E1?style=for-the-badge&logo=postgresql&logoColor=white" alt="PostgreSQL">
  <img src="https://img.shields.io/badge/JDBC-API-blue?style=for-the-badge" alt="JDBC">
  <img src="https://img.shields.io/badge/License-MIT-green.svg" alt="License">
</p>

> Sistema robusto desenvolvido em Java puro utilizando o padrão DAO (Data Access Object) para gerenciar operações completas de CRUD (Create, Read, Update, Delete) integradas com banco de dados relacional PostgreSQL.

---

## Sumário

* [Sobre o Projeto](#sobre-o-projeto)
* [Arquitetura e Tecnologias](#arquitetura-e-tecnologias)
* [Estrutura de Pastas](#estrutura-de-pastas)
* [Pré-requisitos](#pré-requisitos)
* [Como Executar o Projeto](#como-executar-o-projeto)
* [Funcionalidades](#funcionalidades)
* [Autor](#autor)

---

## Sobre o Projeto

Este projeto tem como objetivo principal demonstrar boas práticas de desenvolvimento backend utilizando **Java Standard Edition** e persistência de dados com **JDBC nativo**. Ele gerencia entidades do tipo **Fornecedor**, permitindo o fluxo completo de manipulação de dados de forma segura, modular e orientada a objetos.

---

## Arquitetura e Tecnologias

O projeto adota uma arquitetura em camadas para garantir a separação de responsabilidades:

| Camada / Componente | Descrição |
| :--- | :--- |
| **Model** (`model/`) | Contém as classes de entidade (POJOs) que representam os dados da aplicação. |
| **DAO** (`dao/`) | Responsável pela persistência e comunicação direta com o banco de dados via SQL. |
| **Connection** (`crud/`) | Fábrica de conexões centralizada para gerenciar a sessão com o SGBD. |
| **Main** (`crud/`) | Ponto de entrada da aplicação para testes em console. |

* **Linguagem:** Java (JDK 8+)
* **Banco de Dados:** PostgreSQL
* **Driver:** PostgreSQL JDBC Driver (`42.7.5`)

---

## Estrutura de Pastas

```text
CRUD-Java/
├── lib/
│   └── postgresql-42.7.5.jar  # Driver de conexão JDBC
├── src/
│   ├── crud/
│   │   ├── ConnectionFactory.java # Gerenciador de conexão com o banco
│   │   └── Main.java              # Executável principal
│   ├── dao/
│   │   └── FornecedorDAO.java     # Regras de banco (SQL Queries)
│   └── model/
│       └── Fornecedor.java        # Entidade de domínio
├── .gitignore
├── .classpath
└── .project
