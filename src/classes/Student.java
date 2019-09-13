package classes;


public class Student {
    private String name;
    private int id;
    private Address address;
    private Address2 address2;
    public static int STUDENT_INT = 5;

    public Student(int id, String name) {
        this.name = name;
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setAddress2(Address2 address2) {
        this.address2 = address2;
    }

    //get and set нужно вызвать метод, чтобы прочитать поле
    public int getId() {
        return id;
    }

    public void setId() {


    }
    public String getName() {return name;}


}
