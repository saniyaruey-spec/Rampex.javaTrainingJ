package Day4;
import java.util.Scanner;
public class AddInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter the number:");
        int n = scanner.nextInt();

        for(int i = 1; i <= n; ++i) {
            sum += i;
        }

        System.out.println(sum);
    }
}
