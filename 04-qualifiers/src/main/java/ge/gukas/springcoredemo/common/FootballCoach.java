package ge.gukas.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "ფეხბურთის მწვრთნელი: ივარჯიშე კუთხურების ჩამოწოდებაში..!";
    }
}
