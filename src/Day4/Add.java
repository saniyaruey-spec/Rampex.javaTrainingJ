package Day4;

public class Add {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; ++i) {
            int var10001 = i++;
            ++i;
            System.out.print(var10001 + i + " ");
        }

    }
}
