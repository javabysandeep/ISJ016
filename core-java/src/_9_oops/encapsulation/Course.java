package _9_oops.encapsulation;

public class Course {
    private int id;
    private String name;
    private String price;

    //constructor
    public Course() {
    }

    public Course(int id, String name, String price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    //getter

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    //setter

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
