package dasturlash.uz;

import org.springframework.beans.factory.annotation.Autowired;

public class Lesson {
    private String name = "Java";
    @Autowired
    private Professor professor; // domla
    @Autowired
    private Assistant assistant; // yordamchi shogirt

    public void showDetail() {
        System.out.println("Lesson{" +
                "name='" + name + '\'' +
                ", professor=" + professor +
                ", assistant=" + assistant +
                '}');
    }
}