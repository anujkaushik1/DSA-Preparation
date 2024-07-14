package OOPS.Abstraction;

public abstract class Bank {
    protected String accountNo;
    protected int balance;

    public Bank(String accountNo){
        this.accountNo = accountNo;
        this.balance = 0;
    }
    public Bank(String accountNo, int balance){
        this.accountNo = accountNo;
        this.balance = balance;
    }

    abstract void deposit(int amount);
    abstract int withdraw(int amount);

    protected int getBalance(){
        return this.balance;
    }
}
