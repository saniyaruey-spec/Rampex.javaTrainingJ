package Day1;

public class Char_Type {
    public static void main(String[] args) {
        char ch = '%';
        if (Character.isUpperCase(ch)) {
            System.out.println(ch + " is the upper value");
        } else if (Character.isLowerCase(ch)) {
            System.out.println(ch + " is the lower value");
        } else {
            System.out.println(ch + " is the special character");
        }

    }
}
