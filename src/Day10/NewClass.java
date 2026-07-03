package Day10;

public class NewClass {
    public static void main(String[] args) {
        String[] arr = {"sam", "jane", "sam", "tom"};
        for (int i = 0; i < arr.length; i++) {
               for (int j = 0; j < arr.length; j++) {
                System.out.println(arr[j] + " " + arr[j]);
            }
        }
    }
}