# README

## Overview

This project implements a task reminder system using the **Singleton**, **Observer**, and **Factory** design patterns. It ensures efficient task management by dynamically creating reminders, notifying users, and maintaining a single instance of the task manager.

## Structure

The project follows an object-oriented design and includes the following components:

### 1. **Singleton Pattern (`TaskManager.java`)**

- Ensures only one instance of `TaskManager` exists.
- Centralized management of tasks and users.
- Prevents duplicate instances that could lead to inconsistencies.

### 2. **Observer Pattern (`User.java`)**

- Users subscribe to the `TaskManager`.
- When a new task is added, all users receive notifications.
- Implements real-time updates for task assignments.

### 3. **Factory Pattern (`ReminderFactory.java`)**

- Dynamically creates reminders (`EmailReminder`, `SMSReminder`).
- Provides flexibility by allowing new types of reminders without modifying core logic.

### 4. **Concrete Classes**

- **`Task.java`**: Represents individual tasks.
- **`Reminder.java`**: Interface for different reminder types.
- **`EmailReminder.java`, `SMSReminder.java`**: Implementations of `Reminder` created using the factory pattern.
- **`TaskReminderSystem.java`**: Main entry point demonstrating how tasks and reminders work together.

## How to Run

1. Compile all Java files.
2. Run `TaskReminderSystem.java`.
3. Observe how reminders are created dynamically and users get notified upon task creation.
4. Test the singleton behavior by verifying that `TaskManager` maintains a single instance.

## Key Takeaways

- **Singleton Pattern** ensures controlled access to `TaskManager`, preventing multiple instances.
- **Observer Pattern** dynamically updates users when new tasks are assigned.
- **Factory Pattern** simplifies the creation of different types of reminders.
