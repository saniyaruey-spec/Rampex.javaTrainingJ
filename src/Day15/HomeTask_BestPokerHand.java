package Day15;

public class HomeTask_BestPokerHand {
        public static String bestHand(int[] ranks, char[] suits) {

            boolean flush = true;

            for (int i = 1; i < suits.length; i++) {
                if (suits[i] != suits[0]) {
                    flush = false;
                    break;
                }
            }

            if (flush)
                return "Flush";

            int[] freq = new int[14];
            int max = 0;

            for (int rank : ranks) {
                freq[rank]++;
                if (freq[rank] > max)
                    max = freq[rank];
            }

            if (max >= 3)
                return "Three of a Kind";
            else if (max == 2)
                return "Pair";
            else
                return "High Card";
        }

        public static void main(String[] args) {

            int[] ranks = {13, 2, 3, 1, 9};
            char[] suits = {'a', 'a', 'a', 'a', 'a'};

            System.out.println(bestHand(ranks, suits));
        }
}