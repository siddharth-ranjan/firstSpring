package standAloneCollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("standAloneCollectionConfig.xml");
        Person p1 = context.getBean("p1", Person.class);

//        System.out.println(p1);
        System.out.println(p1.getFriends());
        System.out.println(p1.getFriends().getClass().getName());
        System.out.println("--------------------------------------------");
        System.out.println(p1.getFee());
        System.out.println(p1.getFee().getClass().getName());

    }
}
