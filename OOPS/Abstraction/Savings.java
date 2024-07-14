package OOPS.Abstraction;

public class Savings extends Bank{

    public Savings(String accountNo){
        super(accountNo);
    }

    public Savings(String accountNo, int balance){
        super(accountNo, balance);
    }

    @Override
    void deposit(int amount) {
        balance += amount;
    }

    @Override
    int withdraw(int amount) {

        // additional charges
        int temp = balance - 10 - amount;

        if(temp < 0){
            System.out.println("Balance not enough");
            return -1;
        }
        balance = temp;
        return amount;
    }

    public static void main(String[] args) {
        Savings savingAcc = new Savings("123");
        savingAcc.deposit(800);
//        System.out.println(savingAcc.withdraw(500));
//        System.out.println(savingAcc.getBalance());

        System.out.println(savingAcc.withdraw(790));
        System.out.println(savingAcc.withdraw(10));
        System.out.println(savingAcc.getBalance());

    }
}
