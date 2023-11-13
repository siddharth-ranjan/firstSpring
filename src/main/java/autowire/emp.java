package autowire;

public class emp {
    private address address;
    private zip zip;

    public autowire.address getAddress() {
        return address;
    }

    public void setAddress(autowire.address address) {
        this.address = address;
    }

    public autowire.zip getZip() {
        return zip;
    }

    public void setZip(autowire.zip zip) {
        this.zip = zip;
    }

    public emp() {
        super();
    }

    @Override
    public String toString() {
        return "emp{" +
                "address=" + address +
                ", zip=" + zip +
                '}';
    }
}
