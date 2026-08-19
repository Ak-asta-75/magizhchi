package collections.Demo;
import java.util.ArrayList;
import java.util.Scanner;

// Main public class comes first
public class LibraryManagementSystem {
    public static void main(String[] args) {
        ArrayList<Book> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 7) {
            System.out.println("--- LIBRARY MANAGEMENT SYSTEM ---");
            System.out.println("1. Add Book");
            System.out.println("2. View All Books");
            System.out.println("3. Search Book by ID");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Delete Book");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    boolean exists = false;
                    for (Book b : list) {
                        if (b.bookId == id) {
                            exists = true;
                            break;
                        }
                    }

                    if (exists) {
                        System.out.println("Error: Book ID already exists!");
                    } else {
                        System.out.print("Enter Book Title: ");
                        String title = scanner.nextLine();
                        System.out.print("Enter Author Name: ");
                        String author = scanner.nextLine();

                        list.add(new Book(id, title, author));
                        System.out.println("Book added successfully!");
                    }
                    break;

                case 2:
                    if (list.isEmpty()) {
                        System.out.println("No books available.");
                    } else {
                        for (Book b : list) {
                            System.out.println("ID: " + b.bookId + " | Title: " + b.title + 
                                               " | Author: " + b.author + " | Status: " + b.status);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Book ID to search: ");
                    int searchId = scanner.nextInt();
                    boolean foundSearch = false;

                    for (Book b : list) {
                        if (b.bookId == searchId) {
                            System.out.println("Found: ID: " + b.bookId + " | Title: " + b.title + 
                                               " | Author: " + b.author + " | Status: " + b.status);
                            foundSearch = true;
                            break;
                        }
                    }
                    if (!foundSearch) {
                        System.out.println("Book not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Book ID to issue: ");
                    int issueId = scanner.nextInt();
                    boolean foundIssue = false;

                    for (Book b : list) {
                        if (b.bookId == issueId) {
                            foundIssue = true;
                            if (b.status.equals("Issued")) {
                                System.out.println("Warning: Book is already issued!");
                            } else {
                                b.status = "Issued";
                                System.out.println("Book issued successfully!");
                            }
                            break;
                        }
                    }
                    if (!foundIssue) {
                        System.out.println("Book not found.");
                    }
                    break;

                case 5:
                    System.out.print("Enter Book ID to return: ");
                    int returnId = scanner.nextInt();
                    boolean foundReturn = false;

                    for (Book b : list) {
                        if (b.bookId == returnId) {
                            foundReturn = true;
                            if (b.status.equals("Available")) {
                                System.out.println("Warning: Book is already available!");
                            } else {
                                b.status = "Available";
                                System.out.println("Book returned successfully!");
                            }
                            break;
                        }
                    }
                    if (!foundReturn) {
                        System.out.println("Book not found.");
                    }
                    break;

                case 6:
                    System.out.print("Enter Book ID to delete: ");
                    int deleteId = scanner.nextInt();
                    boolean foundDelete = false;

                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i).bookId == deleteId) {
                            list.remove(i);
                            System.out.println("Book deleted successfully!");
                            foundDelete = true;
                            break;
                        }
                    }
                    if (!foundDelete) {
                        System.out.println("Book not found.");
                    }
                    break;

                case 7:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
        scanner.close();
    }
}

class Book {
    int bookId;
    String title;
    String author;
    String status;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.status = "Available";
    }
}