package Day15;

public class HomeTask_ConsistentString {
    public static int countConsistentStrings(String allowed, String[] words) {

        int count = 0;

        for (String word : words) {

            boolean valid = true;

            for (char ch : word.toCharArray()) {

                if (allowed.indexOf(ch) == -1) {
                    valid = false;
                    break;
                }
            }

            if (valid)
                count++;
        }

        return count;
    }

    public static void main(String[] args) {

        String allowed = "ab";
        String[] words = {"ad", "bd", "aaab", "baa", "badab"};

        System.out.println(countConsistentStrings(allowed, words));
    }
}
