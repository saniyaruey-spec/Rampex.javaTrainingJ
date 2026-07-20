package Day15;

public class HomeTask_DigitGame {
    public static boolean canAliceWin(int[] nums) {

        int singleDigitSum = 0;
        int doubleDigitSum = 0;

        for (int num : nums) {
            if (num < 10)
                singleDigitSum += num;
            else
                doubleDigitSum += num;
        }

        return singleDigitSum != doubleDigitSum;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 10};

        System.out.println(canAliceWin(nums));
    }
}
