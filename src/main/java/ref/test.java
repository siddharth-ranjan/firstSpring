package ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("refConfig.xml");

        A a = (A) context.getBean("aref");
        B b = (B) context.getBean("bref");

        System.out.println("Y = " + b.getY());

        System.out.println("X = " + a.getX());
        System.out.println("OB = " + a.getOb());
        System.out.println("A-Y = " + a.getOb().getY());

        System.out.println(a);
        System.out.println(b);
    }
}
