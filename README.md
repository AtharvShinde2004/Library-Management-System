# Library Management System

## Overview

**Project Name:** Library Management System

**Developer:** Atharv Shinde

**Date of Creation:** 30-11-2023

## Introduction

The Library Management System is a console-based Java application developed by Atharv Shinde. This system allows users to perform various operations related to library management, such as adding books, displaying available books, borrowing books, and returning books.

## Features

1. **Add Book:**
   - Users can add new books to the library by providing the title and author information.
   - The system assigns default availability status to the newly added book.

2. **Display Available Books:**
   - Users can view a list of available books in the library.
   - The list includes details such as title, author, and availability status.

3. **Borrow Book:**
   - Users can borrow a book by entering the title of the desired book.
   - If the book is available, the system marks it as borrowed.

4. **Return Book:**
   - Users can return a previously borrowed book by entering its title.
   - The system updates the availability status of the returned book.

5. **Exit:**
   - Users can choose to exit the system.

## Implementation

### Classes

1. **Book:**
   - Represents a book with attributes such as title, author, and availability.
   - Provides methods to retrieve book details and update availability.

2. **Library:**
   - Manages the collection of books.
   - Provides methods to add books, display available books, borrow books, and return books.

3. **LibraryManagementSystem:**
   - Main class that interacts with users through the console.
   - Implements the user interface and handles user input.

### Workflow

1. **Adding a Book:**
   - User inputs the title and author of the book.
   - The system creates a new Book object and adds it to the library.

2. **Displaying Available Books:**
   - The system iterates through the book collection and displays details of available books.

3. **Borrowing a Book:**
   - User enters the title of the book to borrow.
   - If the book is available, its status is updated to "borrowed."

4. **Returning a Book:**
   - User enters the title of the book to return.
   - If the book is marked as borrowed, its status is updated to "available."

5. **Exiting the System:**
   - Users can choose to exit the system, terminating the program.

## Usage

1. **Compile:**
   - Compile the Java files using the following command:
     ```bash
     javac LibraryManagementSystem.java
     ```

2. **Run:**
   - Run the compiled program using:
     ```bash
     java LibraryManagementSystem
     ```

3. **Interact:**
   - Follow the on-screen instructions to perform various library operations.

## Conclusion

The Library Management System by Atharv Shinde is a simple yet effective console-based application for managing library operations. Users can easily add, view, borrow, and return books through an intuitive interface. This project demonstrates fundamental concepts of object-oriented programming and provides a practical solution for small-scale library management.
