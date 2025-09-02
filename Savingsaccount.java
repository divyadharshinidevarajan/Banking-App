 import java.util.*;
 public class Savingsaccount extends Account {
    private String accountnum;
    private double balance;
    public Savingsaccount(String accountnum,double balance){
        super(accountnum,balance);
    }
    public void accountType(){
        System.out.println("This is a Savings Account");
    }
}
