package lifeCycle;

import org.springframework.context.annotation.ContextAnnotationAutowireCandidateResolver;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("lcXML.xml");
        context.registerShutdownHook();
//        Samosa s1 = (Samosa) context.getBean("s1");
//
//        System.out.println(s1);
//
//        System.out.println(context.getBean("p1"));

        Example ex1 = (Example) context.getBean("ex1");

        System.out.println(ex1);

    }
}
