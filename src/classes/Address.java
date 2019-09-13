package classes;

public class Address {
    private String city;
    private String street;
    private String house;

    public Address(String city, String street, String house) {
        this.city = city;
        this.street = street;
        this.house = house;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getHouse() {
        return house;
    }

    public String FullAddress () {
        return city + " " + street + " " + house;
    }


    public static String getStaticFullAddress (Address address) {
        return address.getCity() + " " + address.getStreet() + " " + address.getHouse();
    }
}
