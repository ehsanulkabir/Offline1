/**
 * Created by Sinha PC on 20-Sep-15.
 */
public class Account {
    private
    Customer name;
    int accountNumber;
    double balance;
    String branch;
    public
    Account(Customer name1, int aN, double balance) {
        name=name1;
        accountNumber=aN;
        this.balance=balance;
    }

    Account(Customer name1, int aN, String br) {
        name=name1;
        accountNumber=aN;
        branch=br;
    }

    void  setBranch(String branch) {
        this.branch=branch;
    }

    String  getCustomerName() {
        return name.getName();
    }

    String  getBranch() {
        return branch;
    }

    int  getAccountNumber() {
        return accountNumber;
    }

    void  credit(double cr) {
        balance+=cr;
    }

    void  debit(double db) {
        if(balance>=db) balance-=db;
        else System.out.println("Amount withdrawn exceeds the current balance!");
    }

    double  getBalance() {
        return balance;
    }

    void  setBalance(double balance) {
        this.balance=balance;
    }

    void  print()
    {
        System.out.println ( "Customer: " + getCustomerName() +" Branch: " + getBranch() + " A/C no: " + getAccountNumber() + " Balance: " + getBalance());
    }

    Customer  getCustomer() {
        return this.name;
    }
}
