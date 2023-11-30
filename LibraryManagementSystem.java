import java.util.ArrayList;
import java.util.Scanner;

class Book {

  private String title;
  private String author;
  private boolean available;

  public Book(String title, String author) {
    this.title = title;
    this.author = author;
    this.available = true;
  }

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public boolean isAvailable() {
    return available;
  }

  public void setAvailable(boolean available) {
    this.available = available;
  }
}

class Library {

  private ArrayList<Book> books;

  public Library() {
    this.books = new ArrayList<>();
  }

  public void addBook(String title, String author) {
    Book newBook = new Book(title, author);
    books.add(newBook);
    System.out.println("Book added successfully: " + title + " by " + author);
  }

  public void displayAvailableBooks() {
    System.out.println("\nAvailable Books:");
    System.out.println(
      "-----------------------------------------------------------------"
    );
    System.out.printf("%-30s %-20s %-10s\n", "Title", "Author", "Available");
    System.out.println(
      "-----------------------------------------------------------------"
    );

    for (Book book : books) {
      if (book.isAvailable()) {
        System.out.printf(
          "%-30s %-20s %-10s\n",
          book.getTitle(),
          book.getAuthor(),
          "Yes"
        );
      }
    }
  }

  public void borrowBook(String title) {
    for (Book book : books) {
      if (book.getTitle().equalsIgnoreCase(title) && book.isAvailable()) {
        book.setAvailable(false);
        System.out.println("Book borrowed successfully: " + title);
        return;
      }
    }
    System.out.println("Book not available or does not exist: " + title);
  }

  public void returnBook(String title) {
    for (Book book : books) {
      if (book.getTitle().equalsIgnoreCase(title) && !book.isAvailable()) {
        book.setAvailable(true);
        System.out.println("Book returned successfully: " + title);
        return;
      }
    }
    System.out.println("Book not found or already returned: " + title);
  }
}

public class LibraryManagementSystem {

  public static void main(String[] args) {
    Library library = new Library();
    try (Scanner scanner = new Scanner(System.in)) {
      while (true) {
        System.out.println("\nLibrary Management System");
        System.out.println("1. Add Book");
        System.out.println("2. Display Available Books");
        System.out.println("3. Borrow Book");
        System.out.println("4. Return Book");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        switch (choice) {
          case 1:
            System.out.print("Enter title of the book: ");
            String title = scanner.nextLine();
            System.out.print("Enter author of the book: ");
            String author = scanner.nextLine();
            library.addBook(title, author);
            break;
          case 2:
            library.displayAvailableBooks();
            break;
          case 3:
            System.out.print("Enter title of the book to borrow: ");
            String borrowTitle = scanner.nextLine();
            library.borrowBook(borrowTitle);
            break;
          case 4:
            System.out.print("Enter title of the book to return: ");
            String returnTitle = scanner.nextLine();
            library.returnBook(returnTitle);
            break;
          case 5:
            System.out.println("Exiting Library Management System. Thank you!");
            System.exit(0);
          default:
            System.out.println("Invalid choice. Please enter a valid option.");
        }
      }
    }
  }
}
