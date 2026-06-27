package Day_7;
import java.util.Scanner;
public class Array3 {
    public static void main (String [] args){
        int [] arr={1,2,3,4,5};
        Scanner sc=new Scanner(System.in);
        int sum=0;
        for(int i=0;i<5;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}
