package Day11;

public class AmstrongNumber {
    public static void main(String [] args){
        System.out.print(checkAms(153));
    }
    public static boolean checkAms(int num){
        int original=num;
        int temp=num;
        int digit=0;
        while(temp!=0){
            temp=temp/10;
            digit++;
        }
        int sum=0;
        int rem;
        while(num!=0){

            rem=num%10;
            sum += (int) Math.pow(rem, digit);
            num=num/10;
        }
        System.out.println("the sum is:"+sum);
        if(original==sum){
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
        return original==sum;
    }
}

