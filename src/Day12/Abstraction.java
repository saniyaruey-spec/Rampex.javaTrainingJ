package Day12;

public class Abstraction {
    public static void main(String [] args){
        SbiAccount s1 =new SbiAccount();
        System.out.println(s1.checkBalance());
        s1.accName="Arjun";
        s1.deposit(1000);
        System.out.println(s1.getBlance());

    }
}
interface rbi{
    public void deposit(float amount);
    public void withdraw(float withdraw);
    public float checkBalance();
}
class SbiAccount implements rbi{
    private String accName;
    private int accId;
    private float balance;
    public String getAccName(){
        return accName;
        }
    public float getBalance(){
        return balance;
    }
    public int getAccId(){
        return accId;
    }

    @Override
    public void deposit(float amount) {
        balance=balance+amount;
        System.out.println("Amount deposited in: "+accName+"is : "+amount+" Remaining balance: "+balance);

    }

    @Override
    public void withdraw(float amount) {
        balance=balance-amount;
        System.out.println("Amount withdraw: "+amount+" Remaining balance: "+balance);

    }

    @Override
    public float checkBalance() {
        return balance;
    }
}
class Hdfc implements rbi{
    private String accName;
    private int accId;
    private float balance;

    @Override
    public void deposit(float amount) {
        balance=balance+amount;
        System.out.println("Amount deposited: "+amount+" Remaining balance: "+balance);

    }

    @Override
    public void withdraw(float amount) {
        balance=balance-amount;
        System.out.println("Amount withdraw: "+amount+" Remaining balance: "+balance);

    }

    @Override
    public float checkBalance() {
        return balance;
    }
}