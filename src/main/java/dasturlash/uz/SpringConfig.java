package dasturlash.uz;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = "dasturlash.uz")
@Configuration
public class SpringConfig {

    @Bean
    public Professor professor() {
        Professor professor = new Professor();
        professor.setName("Domlajon");
        professor.setSurname("Domlayev");
        return professor;
    }

    @Bean
    public Assistant assistant() {
        Assistant assistant = new Assistant();
        assistant.setName("Shogirtjon");
        assistant.setSurname("Mazgiyev");
        return assistant;
    }

    @Bean
    public Lesson lesson() {
        Lesson lesson = new Lesson();
        return lesson;
    }
}
