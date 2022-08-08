package Day1;

public class Coustomer {
    private int id;
    private String name;
    private char gender ;

    public Coustomer(int id, String name , char gender ){
        this.id=id;
        this.name=name;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if(gender == 'm' || gender =='f') {
            this.gender = gender;

        } else  {
            throw new RuntimeException("Please enter m or f ");
        }
    }

}// end
