package collections.Demo;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem 
{
    public static void main(String[] args) 
    {
        ArrayList<Student> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) 
        {
            System.out.println("--- MENU ---");
            System.out.println("1. Add ");
            System.out.println("2. View all ");
            System.out.println("3. Search ");
            System.out.println("4. Update Mark ");
            System.out.println("5. Delete ");
            System.out.println("6. Exit ");
            
            System.out.print("Choice: ");
            int choice = scanner.nextInt();

            if (choice == 6) 
            {
                System.out.println("Goodbye!");
                break;
            }

            if (choice == 1) 
            {
                System.out.print("Roll: ");
                int roll = scanner.nextInt();
                scanner.nextLine();

                Student found = null;
                for (Student s : list) 
                {
                    if (s.rollNumber == roll) found = s;
                }

                if (found != null) 
                {
                    System.out.println("Error: Roll number exists!");
                } 
                else 
                {
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Course: ");
                    String course = scanner.nextLine();
                    System.out.print("Marks: ");
                    double marks = scanner.nextDouble();

                    list.add(new Student(roll, name, age, course, marks));
                    System.out.println("Student added!");
                }
            } 
            else if (choice == 2) 
            {
                if (list.isEmpty()) 
                {
                    System.out.println("No records found.");
                } 
                else 
                {
                    for (Student s : list) 
                    {
                        System.out.println(s.rollNumber + " | " + s.name + " | " + s.age + " | " + s.course + " | " + s.marks);
                    }
                }
            } 
            else if (choice == 3) 
            {
                System.out.print("Enter Roll to Search: ");
                int roll = scanner.nextInt();
                Student found = null;

                for (Student s : list) 
                {
                    if (s.rollNumber == roll) found = s;
                }

                if (found != null) 
                {
                    System.out.println("Found: " + found.name + " | " + found.course + " | " + found.marks);
                } 
                else 
                {
                    System.out.println("Not found.");
                }
            } 
            else if (choice == 4) 
            { 
                System.out.print("Enter Roll to Update: ");
                int roll = scanner.nextInt();
                Student found = null;

                for (Student s : list) 
                {
                    if (s.rollNumber == roll) found = s;
                }

                if (found != null) 
                {
                    System.out.print("Enter New Marks: ");
                    found.marks = scanner.nextDouble();
                    System.out.println("Marks updated!");
                } 
                else 
                {
                    System.out.println("Not found.");
                }
            } 
            else if (choice == 5) 
            { 
                System.out.print("Enter Roll to Delete: ");
                int roll = scanner.nextInt();
                Student found = null;

                for (Student s : list) 
                {
                    if (s.rollNumber == roll) found = s;
                }

                if (found != null) 
                {
                    list.remove(found);
                    System.out.println("Deleted!");
                } 
                else 
                {
                    System.out.println("Not found.");
                }
            } 
            else 
            {
                System.out.println("Invalid choice!");
            }
        }
        scanner.close();
    }
}

class Student 
{
    int rollNumber;
    String name;
    int age;
    String course;
    double marks;

    public Student(int rollNumber, String name, int age, String course, double marks) 
    {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.course = course;
        this.marks = marks;
    }
}