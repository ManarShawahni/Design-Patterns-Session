# README

## Overview

This project implements a banking system using the Singleton pattern. The Singleton approach ensures that only one instance of the `BankDatabase` is created, preventing unnecessary multiple connections and optimizing resource management.

## Structure

The project follows an object-oriented design and includes the following components:

### 1. **Before Singleton (`BeforeBankSystem.java`)**

- A simple implementation where multiple instances of `BankDatabase` are created unnecessarily.
- Demonstrates inefficiency in resource management due to redundant object creation.

### 2. **Singleton Implementation (`BankDatabase.java`)**

- Implements the Singleton pattern to ensure that only one instance of `BankDatabase` is created.
- Uses a `private` constructor to restrict direct instantiation.
- Provides a `getInstance()` method to return a single instance.

### 3. **After Singleton (`AfterBankSystem.java`)**

- Demonstrates the improved system where all database requests share a single instance.
- Ensures efficient connection handling and prevents multiple object creation.

## How It Works

1. The first time `getInstance()` is called, a new `BankDatabase` instance is created.
2. Any subsequent calls to `getInstance()` return the same instance.
3. The Singleton pattern prevents unnecessary database connections, reducing resource consumption.
4. Users can check balances and withdraw money using the same shared database instance.

## How to Run

1. Compile all Java files.
2. Run `BeforeBankSystem.java` to observe inefficient multiple object creation.
3. Run `AfterBankSystem.java` to see the optimized Singleton approach.

## Benefits of Singleton Pattern in This Project

- **Optimized Resource Utilization**: Prevents multiple connections to the database.
- **Global Access**: Ensures all database operations use the same instance.
- **Encapsulation**: Restricts direct instantiation and controls access through `getInstance()`.
