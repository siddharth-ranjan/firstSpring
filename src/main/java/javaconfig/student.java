package javaconfig;

import org.springframework.stereotype.Component;

//@Component("first")
public class student {

    private Samosa samosa;

    public student(Samosa samosa) {
        this.samosa = samosa;
    }

    public Samosa getSamosa() {
        return samosa;
    }

    public void setSamosa(Samosa samosa) {
        this.samosa = samosa;
    }

    public void disp(){
        this.samosa.display();
        System.out.println("Student is studying..");
    }
}
