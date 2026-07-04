package Day13;
import java.util.Scanner;
public class Error {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        try{
            int a=sc.nextInt();
            System.out.print(a+a);
        }
        catch(Exception e){

        }
       System.out.println("Program ended");

    }
}
