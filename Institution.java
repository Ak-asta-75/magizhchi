package inner_class;
import java.util.Scanner;

public class Institution {
    String institutionName = "ABC Institution";
    class Student {
        String studentName;
        int rollNo;
        int[] marks;
        double average;
        String grade;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Institution institution = new Institution();
        Institution.Student student = null;

        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. Add Marks");
            System.out.println("3. Calculate Grade");
            System.out.println("4. Display Student Details");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    student = institution.new Student();
                    scanner.nextLine(); // Clear newline
                    System.out.print("Enter Student Name: ");
                    student.studentName = scanner.nextLine();
                    System.out.print("Enter Roll No: ");
                    student.rollNo = scanner.nextInt();
                    System.out.print("Enter Number of Subjects: ");
                    int count = scanner.nextInt();
                    student.marks = new int[count];
                    break;

                case 2:
                    if (student == null || student.marks == null) {
                        System.out.println("Add a student first!");
                        break;
                    }
                    System.out.println("Enter Marks:");
                    for (int i = 0; i < student.marks.length; i++) {
                        student.marks[i] = scanner.nextInt();
                    }
                    break;

                case 3:
                    if (student == null || student.marks == null) {
                        System.out.println("Add a student and marks first!");
                        break;
                    }
                    int total = 0;
                    for (int m : student.marks) {
                        total += m;
                    }
                    student.average = (double) total / student.marks.length;
                    if (student.average >= 90) student.grade = "A";
                    else if (student.average >= 75) student.grade = "B";
                    else if (student.average >= 50) student.grade = "C";
                    else student.grade = "Fail";

                    System.out.println("Grade calculated!");
                    break;

                case 4:
                    if (student == null) {
                        System.out.println("No student data available!");
                        break;
                    }
                    System.out.println("\nInstitution Name: " + institution.institutionName);
                    System.out.println("Student Name: " + student.studentName);
                    System.out.println("Roll No: " + student.rollNo);
                    System.out.print("Marks: ");
                    for (int m : student.marks) {
                        System.out.print(m + " ");
                    }
                    System.out.printf("Average: ", student.average);
                    System.out.println("Grade: " + student.grade);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}