package Day8;
import java.util.Scanner;
public class ParallalArrays {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String [] drinks={"pepsi","maza","sprite","cocola","slice"};
        int [] prices={40,30,25,45,50};
        System.out.println("pepsi,maza,sprite,cocola,slice");
        System.out.println("Enter the name of the drink: ");
        String name=sc.nextLine();
        System.out.println("Enter the quantity: ");
        int qty=sc.nextInt();
        for (int i=0;i<drinks.length;i++){
            if(name.equals(drinks[i])){
                System.out.println(qty*prices[i]);
            }
        }
    }
}
