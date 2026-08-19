package Day16;
import java.util.ArrayList;
public class CollectionAdd {
        public static void main(String[] args){
            ArrayList<String> num= new ArrayList<>();
            num.add("Saniya");
            num.add("Madanki");
            num.add("Seshan");
            num.add("Ragav");
            num.add("Sneha");
//        for(int i=0;i<num.size();i++) {
//            System.out.println(num.get(i));
//        }
            for(String i : num){
                System.out.println(i + " " + i.length());
            }
        }
}
