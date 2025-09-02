import java.util.*;
public class Customers {
    private String name;
    private Account account;

    public Customers(String name, Account account) {
        this.name = name;
        this.account = account;
    }

    public void showDetails() {
        System.out.println("\nCustomer Name: " + name);
        account.accountType();
        System.out.println("Account Number: " + account.getaccountnum());
        System.out.println("Balance: " + account.getbalance());
    }

    public Account getAccount() { return account; }
    public String getName() { return name; }
}