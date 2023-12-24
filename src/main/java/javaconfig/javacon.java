package javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "javaconfig")
public class javacon {

    @Bean
    public Samosa getSomosas(){
        return new Samosa();
    }

    @Bean
    public student getStudents(){
        //creating new obj and returning.
        return new student(getSomosas());
    }
}
