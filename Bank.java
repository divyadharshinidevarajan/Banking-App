import java.util.*;
public class Bank {
    private List<Customers>customers;
    public Bank(){
        customers=new ArrayList<>();
   
    }
    public void addCustomers(Customers customer){
      customers.add(customer);
    }
    public void showAll(){
        System.out.println("________________________All Customers___________________________");
        for(Customers c:customers){
          c.showDetails();
        }
    }
     public List<Customers> getCustomers() {   // Getter to use in main
        return customers;
    }

}
