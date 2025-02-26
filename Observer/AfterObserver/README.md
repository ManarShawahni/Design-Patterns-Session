# README

## Overview

This project demonstrates a YouTube-like notification system using the Observer pattern. The Observer pattern decouples the notification mechanism, allowing dynamic subscription management.

## Structure

The project follows an object-oriented design and includes the following components:

### 1. **Observer Interface (`Observer.java`)**

- Defines the `update(String video)` method to be implemented by subscribers.

### 2. **Concrete Observer (`User.java`)**

- Implements `Observer`.
- Receives notifications when a new video is uploaded.

### 3. **Subject (Publisher) (`YouTubeChannel.java`)**

- Maintains a list of observers (subscribers).
- Provides methods to subscribe and unsubscribe observers.
- Notifies all observers when a new video is uploaded.

### 4. **Main Application (`MainAfterObserver.java`)**

- Demonstrates how observers (users) subscribe and unsubscribe from the channel.
- Uploading a video automatically notifies all subscribers.

## How to Run

1. Compile all Java files.
2. Run `MainAfterObserver.java`.
3. Observe how subscribers get notified dynamically.
4. Try subscribing and unsubscribing users to see real-time updates.

## Key Takeaways

- The Observer pattern improves flexibility by decoupling subscribers from the publisher.
- Allows dynamic subscription and unsubscription without modifying the publisher.
- Enhances maintainability and scalability by following a well-structured design pattern.
