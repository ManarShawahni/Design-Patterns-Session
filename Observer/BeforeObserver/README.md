# README

## Overview

This project demonstrates a basic implementation of a YouTube-like notification system before applying the Observer pattern. The current approach directly manages subscriber notifications without a decoupled observer mechanism.

## Structure

The project follows an object-oriented design and includes the following components:

### 1. **YouTubeChannel (Publisher)**

- Maintains a list of subscribers.
- Directly notifies subscribers when a new video is uploaded.
- Adds subscribers manually.

### 2. **Subscriber (Observer Equivalent)**

- Represents users who subscribe to a YouTube channel.
- Receives notifications when a new video is uploaded.

### 3. **Main Application (`MainBeforeObserver.java`)**

- Demonstrates how subscribers are manually managed and notified by `YouTubeChannel`.
- Uploading a video triggers a notification to all registered subscribers.

## How to Run

1. Compile all Java files.
2. Run `MainBeforeObserver.java`.
3. Observe how subscribers receive notifications directly from the publisher.

## Key Takeaways

- The current implementation tightly couples the `YouTubeChannel` and `Subscriber` classes.
- Adding or removing subscribers requires direct modification within the `YouTubeChannel` class.
- The Observer pattern can be applied to decouple the notification logic, improving flexibility and scalability.
