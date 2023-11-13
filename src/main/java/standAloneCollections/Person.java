package standAloneCollections;

import java.util.List;
import java.util.Map;

public class Person {
    private List<String> friends;
    private Map<String, Integer> fee;

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    public Map<String, Integer> getFee() {
        return fee;
    }

    public void setFee(Map<String, Integer> fee) {
        this.fee = fee;
    }

//    public Person(List<String> friends) {
//        this.friends = friends;
//    }

    public Person() {
        super();
    }

    @Override
    public String toString() {
        return "Person{" +
                "friends=" + friends +
                ", fee=" + fee +
                '}';
    }
}
