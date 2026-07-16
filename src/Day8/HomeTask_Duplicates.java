package Day8;

public class HomeTask_Duplicates {
        public static void main(String[] args) {

            int arr[] = {2, 5, 7, 2, 8, 5, 9, 7, 7};

            System.out.println("Duplicate Elements:");

            for (int i = 0; i < arr.length; i++) {

                boolean isDuplicate = false;

                // Check if the element has already appeared
                for (int k = 0; k < i; k++) {
                    if (arr[i] == arr[k]) {
                        isDuplicate = true;
                        break;
                    }
                }

                if (isDuplicate) {
                    continue;
                }

                // Count occurrences
                int count = 1;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }

                if (count > 1) {
                    System.out.println(arr[i]);
                }
            }
        }
}