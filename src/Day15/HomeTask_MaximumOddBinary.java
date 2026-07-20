package Day15;

public class HomeTask_MaximumOddBinary {

    public static String maximumOddBinaryNumber(String s) {

        int ones = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '1')
                ones++;
        }

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < ones - 1; i++)
            ans.append('1');

        for (int i = 0; i < s.length() - ones; i++)
            ans.append('0');

        ans.append('1');

        return ans.toString();
    }

    public static void main(String[] args) {

        System.out.println(maximumOddBinaryNumber("0101"));
    }
}
