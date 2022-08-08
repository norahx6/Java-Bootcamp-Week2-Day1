package Week1.Day5;

public class Account {
    private String id;
    private String name;
    private int balance=0;

    public Account(String id, String name){
        this.id=id;
        this.name=name;
    }

    public Account(String id, String name,int balance){
        this.id=id;
        this.name=name;
        this.balance=balance;
    }

    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getBalance(){
        return balance;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int credit(int amount){
        return balance+=amount;
    }

    public int debit(int amount) {
        if (amount <= balance) {
            return balance-amount ;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return 0;
    }
    public int transferTo(Account a2, int amount) {
        if (amount <= balance) {
            System.out.println(amount);
        } else {
            System.out.println("Amount is exceeded balance");
        }
        return balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}// end
