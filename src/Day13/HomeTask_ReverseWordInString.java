package Day13;
import java.util.Arrays;
public class HomeTask_ReverseWordInString {
    public static void main(String[] args){
        RevereWord();

    }
    public static void RevereWord(){
        String str = "Welcome to chennai";
        String[]  word = str.split(" ");
        for(String words : word){
            for(int i=words.length() -1;i>=0;i--) {
                System.out.print(words.charAt(i));

            }
            System.out.print(" ");

        }
    }
}
