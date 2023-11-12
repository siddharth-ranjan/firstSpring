package lifeCycle;

public class Samosa {
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Samosa() {
        super();
    }

    public void init(){
        System.out.println("init called");
    }

    public void destroy(){
        System.out.println("destroy called");
    }

    @Override
    public String toString() {
        return "Samosa{" +
                "price=" + price +
                '}';
    }
}
