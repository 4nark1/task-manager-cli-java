# Task Manager CLI (Java)

# Overview
A command line task manager that allow users to create, manage and persist tasks using Json file.

# Features
- Create Task
- List all Tasks
- Search Task by ID
- Mark Tasks as completed
- Delete Tasks
- Persist Data in Json file

# Architecture
This project follows basic Clean Architecture principles:
- Separation of Concern
- Reposittory Pattern
- Dependency Injection

# Flow of the program:
Main -> TaskManager -> TaskRepository -> Tasks

# Persistence
Files are persisted in a Json file using Gson library

# Technologies:
- Java
- Gson
- CLI - Command Line Interface

# What I learned:
- Clean Architecture fundamentals
- Reposittory Patterns
- Dependency Injection
- File handling in Java
- Json serialization and deserialization using Gson
- Design a maintainable code
- Handling real ID persistence bugs

# How to run:
1. Compile the project:
javac *.java

2. Run the application:
java Main

Note: make sure you are in the project directory and have Java installed otherwise it won't run.
