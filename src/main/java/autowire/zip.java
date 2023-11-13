package autowire;

public class zip {
    private int zip;

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public zip() {
        super();
    }

    public zip(int zip) {
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "zip{" +
                "zip=" + zip +
                '}';
    }
}
