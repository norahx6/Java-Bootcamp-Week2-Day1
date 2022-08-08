package Day1;

public class Invoice {
    private int id;
    private Coustomer2 Coustomer;
    private double amount;

    public Invoice(int id , double amount , String name , int discount){
        this.Coustomer =new Coustomer2 (id,name,discount);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Coustomer2 getCoustomer2() {
        return Coustomer;
    }

    public void setCoustomer2(Coustomer2 coustomer) {
        this.Coustomer = coustomer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "id=" + id +
                ", coustomer2=" + Coustomer +
                ", amount=" + amount +
                '}';
    }

    public String getCoustomername(){
        return  this.Coustomer.getName();
    }
    public int getCoustomerId(){
        return this.Coustomer.getId();
    }
    public double getAmountDiscount(){
        return  this.Coustomer.getDiscount();
    }

    public double getAmountAfterDiscount(){
        return  this.amount = this.amount * this.getAmountDiscount()/ 100;
    }


}//end
