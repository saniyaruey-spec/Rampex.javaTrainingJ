package Day_7;

public class HomeTask_EvenOddCount {
        public static void main(String[] args) {

            int arr[] = {2, 5, 8, 11, 14, 17, 20};

            int even = 0;
            int odd = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0)
                    even++;
                else
                    odd++;
            }

            System.out.println("Even Count = " + even);
            System.out.println("Odd Count = " + odd);
        }
}