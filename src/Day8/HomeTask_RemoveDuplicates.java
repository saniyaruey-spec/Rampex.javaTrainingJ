package Day8;

public class HomeTask_RemoveDuplicates {
        public static void main(String[] args) {

            int arr[] = {4, 2, 4, 6, 2, 7, 6, 8};

            System.out.print("Array after removing duplicates: ");

            for (int i = 0; i < arr.length; i++) {

                boolean isDuplicate = false;

                // Check if the element already appeared before
                for (int j = 0; j < i; j++) {
                    if (arr[i] == arr[j]) {
                        isDuplicate = true;
                        break;
                    }
                }

                // Print only the first occurrence
                if (!isDuplicate) {
                    System.out.print(arr[i] + " ");
                }
            }
        }}
