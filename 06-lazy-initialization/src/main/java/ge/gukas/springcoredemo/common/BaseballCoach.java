package ge.gukas.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements  Coach{

    public BaseballCoach(){
        System.out.println("Constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "ბეისბოლის მწვრთვნელი: ივარჯიშე ჩაწოდებაში..!";
    }
}
