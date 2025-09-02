import java.util.*;
public class BankingApp {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
     Bank bank=new Bank();
     boolean repeat=true;
     while(repeat){
            System.out.println("\n--- Bank Menu ---");
            System.out.println("1. Add Customer");
            System.out.println("2. Show All Customers");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Show Transactions");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();
            switch(ch){
                case 1:{
                sc.nextLine();
                 System.out.print("Enter the customer Name:");
                 String name=sc.nextLine();
                 System.out.println();
                 System.out.print("Enter the account Number:");
                 String accountnum=sc.nextLine();
                 System.out.println();
                 System.out.print("Enter the initial Balance:");
                 double balance=sc.nextDouble();
                 Account ac1;
                 System.out.println("1.Saving Account");
                 System.out.println("2.Current Account");
                 int choice =sc.nextInt();
                 if(choice==1){
                    ac1=new Savingsaccount (accountnum,balance);
                 }
                 else{
                    ac1=new Currentaccount (accountnum,balance);
                 }
                 Customers c1=new Customers(name, ac1);
                 bank.addCustomers(c1);
                 System.out.println(" Customer added successfully!");
                 break;
                }
         
                case 2:
                    bank.showAll();
                    break;
                case 3:
                {
                    sc.nextLine();
                    System.out.println("Enter the account Number: ");
                    String account=sc.nextLine();
                    System.out.println("Enter the Amount:");
                    double amt=sc.nextDouble();
                    for(Customers c:bank.getCustomers()){
                        if(c.getAccount().getaccountnum().equals(account)){
                            c.getAccount().deposit(amt);

                        }

                    }
                    break;
                }
                case 4:
                  {
                    sc.nextLine();
                    System.out.println("Enter the account Number: ");
                    String account=sc.nextLine();
                    System.out.println("Enter the Amount:");
                    double amt=sc.nextDouble();
                    for(Customers c:bank.getCustomers()){
                        if(c.getAccount().getaccountnum().equals(account)){
                            c.getAccount().withdraw(amt);

                        }

                    }
                    break;
                }
                case 5:
                  {
                    sc.nextLine();
                    System.out.println("Enter the account Number: ");
                    String account=sc.nextLine();
                    for(Customers c:bank.getCustomers()){
                        if(c.getAccount().getaccountnum().equals(account)){
                            c.getAccount().showTransactions();

                        }

                    }
                    break;
                }
                case 6:{
                System.out.println("Thanks for banking with us!");
                repeat=false;
                break;
                }
                default:
                System.out.println("Invalid choice");
                break;
                 

            }
     }
     sc.close();
    }
    
}
