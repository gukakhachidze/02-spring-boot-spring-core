package ge.gukas.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

    public TennisCoach(){
        System.out.println("Constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "ტენისის მწვრთნელი: ივარჯიშე ეისში..!";
    }
}