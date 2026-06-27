package Day_7;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayV {
    public static void main(String [] args) {
        int [] arr=new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++) {
            System.out.println("Enter the position "+(i+1) +": ");
            arr[i]= sc.nextInt();
            System.out.println(Arrays.toString(arr));
        }
    }
}
