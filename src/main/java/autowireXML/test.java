package autowireXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autoXMLConfig.xml");
        emp e1 = context.getBean("e1", emp.class);

        System.out.println(e1);
    }
}
