package Day_7;

public class HomeTask_ReplaceNegative {
        public static void main(String[] args) {

            int arr[] = {-5, 10, -8, 20, 15, -3};

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < 0)
                    arr[i] = 0;
            }

            System.out.print("Modified Array: ");

            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
}