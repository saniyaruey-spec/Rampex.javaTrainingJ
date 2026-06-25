package Day_6;
import java.util.Scanner;
public interface Schedule {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        for(int week=1;week<=4;week++){
            for(int day=1;day<=7;day++){
                System.out.println("week"+week+" day "+day);
                System.out.println("come to college "+" study and go home ");
            }
        }
    }
}
