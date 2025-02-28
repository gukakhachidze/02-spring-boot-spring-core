package ge.gukas.springcoredemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // ვაცხადებთ დახურულ ფილდს დეფენდენსისთვის.
    private Coach myCoach;

    // ვაცხადებთ კონსტრუქტორს დეფენდენსისთვის.
    // Autowire - ანოტაცია ეუბნება სპრინგს რომ დეფენდენსი ინჯექშენი გააკეთოს.
    // თუ მხოლოდ ერთი კონსტრუქტორი გვაქვს არ არის აუცილებელი დაწერა Autowire-ს.
    @Autowired
    public DemoController(Coach theCoach){
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
