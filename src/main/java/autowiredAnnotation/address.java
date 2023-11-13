package autowiredAnnotation;

public class address {
    private String street;
    private String city;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public address() {
        super();
    }

    public address(String street, String city) {
        this.street = street;
        this.city = city;
    }

    @Override
    public String toString() {
        return "address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
