package ge.gukas.springcoredemo.common;

public class SwimCoach implements Coach{

    public SwimCoach(){
        System.out.println("In constuctor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "ცურვის მწვრთნელი: გახურებისთვის გაცურე 1000 მეტრი.";
    }
}
