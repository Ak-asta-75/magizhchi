import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);

        int capacity = 10;

        int[] bookId = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        String[] title = {
            "Psychology of Money",
            "Atomic Habits",
            "Wimpy Kid",
            "Harry Potter",
            "Blue Lock",
            "Sherlock Holmes",
            "A Prison Diary",
            "Going Solo",
            "The Hobbit",
            "To Kill a Mockingbird"
        };

        String[] author = {
            "Morgan Housel",
            "James Clear",
            "Jeff Kinney",
            "J.K. Rowling",
            "Muneyuki Kaneshiro",
            "Arthur Conan Doyle",
            "Jeffrey Archer",
            "Roald Dahl",
            "J.R.R. Tolkien",
            "Harper Lee"
        };

        String[] status = {
            "Available", "Available", "Available", "Available", "Available",
            "Available", "Available", "Available", "Available", "Available"
        };

        int choice = 0;

        while (choice != 4) 
		{
            System.out.println("--- LIBRARY MENU ---");
            System.out.println("1. Display all books");
            System.out.println("2. Borrow a book");
            System.out.println("3. Return a book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            if (choice == 1) 
			{
                System.out.println("--- ALL BOOKS IN LIBRARY ---");
                for (int i = 0; i < capacity; i++) 
				{
                    System.out.println("ID: " + bookId[i] + " | Title: " + title[i] + " | Author: " + author[i] + " | Status: " + status[i]);
                }
             
            } 
			else if (choice == 2) 
			{
                System.out.print("Enter Book ID to borrow (1-10): ");
                int Borrow = scanner.nextInt();
                boolean found = false;

                for (int i = 0; i < capacity; i++) 
				{
                    if (bookId[i] == Borrow) 
					{
                        found = true;
                        if (status[i].equals("Available")) 
						{
                            status[i] = "Borrowed";
                            System.out.println("You have successfully borrowed: " + title[i]);
                        } 
						else 
						{
                            System.out.println("Sorry, this book is already borrowed.");
                        }
                        break;
                    }
                }

                if (!found) 
				{
                    System.out.println("Book with ID " + Borrow + " not found.");
                }

            } 
			else if (choice == 3) 
			{
                System.out.print("Enter Book ID to return (1-10): ");
                int Return = scanner.nextInt();
                boolean found = false;

                for (int i = 0; i < capacity; i++) 
				{
                    if (bookId[i] == Return) 
					{
                        found = true;
                        if (status[i].equals("Borrowed")) 
						{
                            status[i] = "Available";
                            System.out.println("You have successfully returned: " + title[i]);
                        } else 
						{
                            System.out.println("This book was not borrowed.");
                        }
                        break;
                    }
                }

                if (!found) 
				{
                    System.out.println("Book with ID " + Return + " not found.");
                }

            } 
			else if (choice == 4) 
			{
                System.out.println("Exiting the Library System. Goodbye!");
            } 
			else 
			{
                System.out.println("Invalid option! Please enter a number between 1 and 4.");
            }
        }

        scanner.close();
    }
}