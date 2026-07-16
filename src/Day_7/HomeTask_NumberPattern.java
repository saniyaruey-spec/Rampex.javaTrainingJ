package Day_7;

public class HomeTask_NumberPattern {
    public static void main(String[] args) {
            int n = 5;

            // Upper Half
            for (int i = 1; i <= n; i++) {
                for (int j = i; j <= n; j++) {
                    System.out.print(j);
                }
                System.out.println();
            }

            // Lower Half
            for (int i = n - 1; i >= 1; i--) {
                for (int j = i; j <= n; j++) {
                    System.out.print(j);
                }
                System.out.println();
            }
        }
}
