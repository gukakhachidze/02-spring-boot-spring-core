package ge.gukas.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

    public TennisCoach(){
        System.out.println("Constructor: " + getClass().getSimpleName());
    }

    // ვქმნით ჩვენს დაწყების(რა მოხდეს დაწყებისას) მეთოდს
    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println("In doMyStartupStuff(): " + getClass().getSimpleName());
    }

    // ვქმნით ჩვენს დასრულების(განადგურებისას რა  მოხდეს) მეთოდს
    @PreDestroy
    public void DoMyCleanupStuff(){
        System.out.println("In DoMyCleanupStuff(): " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "ტენისის მწვრთნელი: ივარჯიშე ეისში..!";
    }
}