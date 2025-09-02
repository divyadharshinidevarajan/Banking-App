import java.util.*;
abstract class Account {
    private String accountnum;
    private double balance;
    private List<Transaction>transaction;
    public Account(String accountnum,double balance){
        this.accountnum= accountnum;
        this.balance=balance;
        this.transaction=new ArrayList<>();
    }
    public String getaccountnum(){
        return accountnum;
    }
    public double getbalance(){
        return  balance;
    }
    public void deposit(double amount){
     balance+=amount;
     transaction.add(new Transaction("Deposit",amount));
     System.out.println("Amount Deposited"+amount+"Balance"+balance);
    }
    public void withdraw(double amount){
        if(balance>=amount){
            balance-=amount;
            transaction.add(new Transaction("Withdraw",amount));
            System.out.println("Amount Withdrawn"+amount+"Balance"+balance);
        }
        else{
            System.out.println("Insufficient Balance!!!");
        }
    }
    public void showTransactions(){
        System.out.println("____________________Transaction History_______________________");
        System.out.println("Transaction in "+accountnum);
        for(Transaction t:transaction ){
            
            System.out.println(t);
        }
    }
    public abstract void accountType();

}
