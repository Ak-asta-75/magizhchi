package stringss;
import java.util.Scanner;
public class StringH1 {
    public static void main(String[] args) {
        String origin = "4589";
        Scanner sc = new Scanner(System.in);
        String enter = sc.nextLine();
        if(origin.equals(enter))
        {
            System.out.println("OTP Verified");
        }    
        else
        {
            System.out.println("Invalid OTP");
        }
        origin.concat("1234");
        System.out.println("After Concat : " + origin);
    }
}
