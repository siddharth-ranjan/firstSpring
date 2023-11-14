package SpEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Num {
    private int x;
    private int y;
    private int z;

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

    @Value("#{100-20}")
    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    @Value("#{ T(java.lang.Math).abs(10+49-41+634) }")
    public void setZ(int z) {
        System.out.println("x: " + x + " y: " + y);
        this.z = z;
    }
    public Num() {
    }

    @Override
    public String toString() {
        return "Num{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
