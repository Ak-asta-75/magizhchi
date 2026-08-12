package stringss;
import java.util.Scanner;

public class CodeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Department: ");
        String dept = scanner.nextLine();
        System.out.print("Year: ");
        int year = scanner.nextInt();
        StringBuilder code = new StringBuilder();
        code.append(name.substring(0, 3).toUpperCase());
        code.append("-");
        code.append(dept.substring(0, 3).toUpperCase());
        code.append("-");
        code.append(year);
        System.out.println("Generated Code: " + code);

        scanner.close();
    }
}
