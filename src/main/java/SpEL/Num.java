package SpEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Num {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    @Value("#{10+20}")
    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Num() {
    }

    @Override
    public String toString() {
        return "Num{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
