package Day1;

public class Coustomer2 {
    private int id;
    private String name;
    private int discount;

    public Coustomer2(int id , String name , int discount){
       this.id=id;
       this.name=name;
       this.discount=discount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Coustomer2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", discount=" + discount +
                '}';
    }

}// end
