# Spring Boot Chat Application

## Overview

This is a simple chat application built using Spring Boot. It allows users to create chats, send messages, and manage user information.

## Features

- **User Management:** Manage user details such as username, profile information, etc.
- **Chat Creation:** Users can create chats for group communication.
- **Messaging:** Exchange messages within created chats.

## Technologies Used

- Spring Boot
- Spring Data JPA
- Spring Web

## Entity Classes

### 1. User

Represents a user of the chat application.

#### Attributes:

- `userId` (Primary Key)
- `username`
- ...

### 2. Chat

Represents a chat group where users can exchange messages.

#### Attributes:

- `chatId` (Primary Key)
- `name`
- ...

### 3. Message

Represents a message sent within a chat.

#### Attributes:

- `messageId` (Primary Key)
- `content`
- `timestamp`
- ...

