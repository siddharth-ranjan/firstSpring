package beanScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("scope.xml");
        Student s1 = context.getBean("student", Student.class);
        System.out.println(s1.hashCode());

        Student s2 = context.getBean("student", Student.class);
        System.out.println(s2.hashCode());
    }
}
