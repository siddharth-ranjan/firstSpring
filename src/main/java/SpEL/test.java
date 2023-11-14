package SpEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class test {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("SpELConfig.xml");
        Num n = context.getBean("num", Num.class);

        SpelExpressionParser temp = new SpelExpressionParser();
        Expression exp = temp.parseExpression("22+44");

        System.out.println(exp.getValue());

        System.out.println(n);
    }

}
