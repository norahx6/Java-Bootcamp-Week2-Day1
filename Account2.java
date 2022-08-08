package Day1;

import Week1.Day5.Account;

public class Account2 {
    private Coustomer coustomer;
    private int id;
    private double balance=0.0;

    public Account2(int id, double balance, Coustomer Coustomer,String name , char gender){
        this.coustomer = new Coustomer(id,name,gender);
        this.id=id;
        this.balance=balance;
    }

    public Account2(int id, Coustomer coustomer){
        this.id=id;
    }

    public int getId(){
        return id;
    }
    public double getBalance(){
        return balance;
    }

    public Coustomer getCoustomer() {
        return coustomer;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCoustomer(Coustomer coustomer) {
        this.coustomer = coustomer;
    }

    @Override
    public String toString() {
        return "Account2{" +
                "coustomer=" + coustomer +
                ", id=" + id +
                ", balance=" + balance +
                '}';
    }



    public Coustomer getCoustomerName (){
        return coustomer;
    }


    public double deposit(double amount) {
            return balance+amount ;
    }

    public double withdraw(double amount) {
        if ( balance >= amount) {
            System.out.println(amount);
        } else {
            System.out.println("Amount withdraw is exceeded balance");
        }
        return balance;
    }

}
