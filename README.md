# DAM_LAB 001 — Java Task Processor

A small Java project focused on refreshing object-oriented programming fundamentals, practicing Test-Driven Development (TDD), and exploring basic software design principles.

## Overview

The project implements a simple task management and processing system. Tasks are stored in a FIFO queue and consumed sequentially by a processor.

This experiment prioritizes readable code, clear responsibilities, unit testing, and a professional Git workflow over unnecessary complexity.

## Features

- **Task:** represents a task with a name, description, and optional purpose.
- **TaskManager:** manages pending tasks using a FIFO queue.
- **TaskProcessor:** consumes pending tasks and returns the processed tasks in order.
- **Input validation:** rejects invalid mandatory task fields and null tasks.
- **Unit testing:** verifies expected behavior and edge cases.

Task processing is currently simulated. The project does not execute real background jobs or persist data.

## Tech Stack

- Java
- Maven
- JUnit Jupiter
- Git and GitHub

## Project Structure

```text
src/
├── main/java/com/damlab/
│   ├── Task.java
│   ├── TaskManager.java
│   └── TaskProcessor.java
└── test/java/com/damlab/
    ├── TaskTest.java
    ├── TaskManagerTest.java
    └── TaskProcessorTest.java
```

## Requirements

- JDK compatible with the project's Maven configuration.
- Maven, or the Maven Wrapper if available.

## Run the Tests

Execute all unit tests with:

```bash
mvn test
```

## Learning Objectives

- Refresh Java and object-oriented programming fundamentals.
- Understand collections, queues, generics, and `Optional`.
- Practice TDD through incremental test implementation.
- Separate responsibilities between classes.
- Work with feature branches, commits, and pull requests.

## Scope

This is the first experiment in the DAM_LAB learning series. The goal is to establish solid Java fundamentals and testing habits before moving on to more complete applications.
