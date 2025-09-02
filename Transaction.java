import java.util.*;
public class Transaction{
    private double amount;
    private String type;
    private Date date;
    public Transaction(String type,double amount){
        this.amount=amount;
        this.type=type;
        this.date=new Date();
    }
    public String toString(){
        return "Rs."+amount+" ---> "+type+" at "+date;
    }
}