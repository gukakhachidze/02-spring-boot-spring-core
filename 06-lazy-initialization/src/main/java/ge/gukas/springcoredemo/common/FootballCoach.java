package ge.gukas.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach{

    public FootballCoach(){
        System.out.println("Constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "ფეხბურთის მწვრთნელი: ივარჯიშე კუთხურების ჩამოწოდებაში..!";
    }
}
