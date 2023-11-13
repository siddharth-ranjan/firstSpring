package autowireXML;

public class emp {
    private address address;
    private zip zip;

    public autowireXML.address getAddress() {
        return address;
    }

    public void setAddress(autowireXML.address address) {
        this.address = address;
    }

    public autowireXML.zip getZip() {
        return zip;
    }

    public void setZip(autowireXML.zip zip) {
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
