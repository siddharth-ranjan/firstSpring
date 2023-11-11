package constructorInjection;
import java.util.List;

public class person {
    private String name;
    private int id;
    private Certificate certi;
    private List<String> list;

    public person(String name, int id, Certificate certi) {
        this.name = name;
        this.id = id;
        this.certi = certi;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", certi=" + certi.name +
                '}';
    }
}
