import java.util.*;
public class Currentaccount extends Account {
    private String accountnum;
    private double balance;
    public Currentaccount(String accountnum,double balance){
        super(accountnum,balance);
    }
    public void accountType(){
        System.out.println("This is a Current Account");
    }
    
}
