package Day_6;
import java.util.Scanner;
public class NewAtm {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int balance = 1000;
        int choice, amount;

        do {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Current Balance: " + balance);
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    amount = sc.nextInt();
                    balance += amount;
                    System.out.println("Deposit Successful.");
                    System.out.println("Updated Balance: " + balance);
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    amount = sc.nextInt();

                    if (amount <= balance) {
                        balance -= amount;
                        System.out.println("Withdrawal Successful.");
                        System.out.println("Remaining Balance: " + balance);
                    } else {
                        System.out.println("Insufficient Balance.");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM.");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}
