package Day_7;

public class HomeTask_ReverseArray {
        public static void main(String[] args) {

            int arr[] = {10, 20, 30, 40, 50};
            int rev[] = new int[arr.length];

            int j = 0;

            for (int i = arr.length - 1; i >= 0; i--) {
                rev[j] = arr[i];
                j++;
            }

            System.out.print("Reversed Array: ");

            for (int num : rev) {
                System.out.print(num + " ");
            }
        }
}