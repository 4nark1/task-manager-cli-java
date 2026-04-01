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
Main -> TaskManager -> TaskRepository -> JsonFileTaskRepository -> Tasks

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

# Requirement to run the program
- Java JDK installed.
- Gson library

# Download Gson
https://repo1.maven.org/maven2/com/google/code/gson/gson/2.13.2/gson-2.13.2.jar

place the .jar file in the project folder.

# How to run on windows:
just double click the run.bat file
