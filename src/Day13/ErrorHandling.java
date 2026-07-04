package Day13;

import java.util.Scanner;

public class ErrorHandling {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int a = sc.nextInt();

        try {
            if (a > 10) {
                throw new ArithmeticException();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
                System.out.println(a);
                System.out.println("program ended successfully");
    }
}
