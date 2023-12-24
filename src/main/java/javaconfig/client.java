package javaconfig;

import beanScope.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class client {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(javacon.class);
        student st = context.getBean("getStudents", student.class);
        System.out.println(st);
        st.disp();
    }
}
