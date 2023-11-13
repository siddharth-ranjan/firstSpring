package stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("stereotypeConfig.xml");
        Student student = context.getBean("ob", Student.class);

        System.out.println(student);
    }
}
