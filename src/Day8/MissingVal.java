package Day8;
import java.util.Scanner;
public class MissingVal {
    public static void main(String[] args) {
        int N = 8;
        int[] arr = {1, 2, 4, 5, 6, 7, 8};

        int expectedSum = N * (N + 1) / 2;
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        int missingNumber = expectedSum - actualSum;

        System.out.println("Missing Number: " + missingNumber);
    }
}
