package Day8;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayReverse {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String [] menu={"veg","non-veg","sweets","beverages"};
        String [] m1=new String[menu.length];
        for(int i=0;i< menu.length;i++){
            m1[i]=menu[menu.length-1-i];
        }
        System.out.println(Arrays.toString(m1 ));
    }
}
