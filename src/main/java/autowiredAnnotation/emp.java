package autowiredAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class emp {
    @Autowired
    @Qualifier("address2")
    private autowiredAnnotation.address address;
    @Autowired
//    @Qualifier
    private autowiredAnnotation.zip zip;

    public autowiredAnnotation.address getAddress() {
        return address;
    }

    public void setAddress(autowiredAnnotation.address address) {
        this.address = address;
    }

    public autowiredAnnotation.zip getZip() {
        return zip;
    }

    public void setZip(autowiredAnnotation.zip zip) {
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
