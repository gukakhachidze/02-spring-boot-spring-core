package ge.gukas.springcoredemo.config;

import ge.gukas.springcoredemo.common.Coach;
import ge.gukas.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("aqua")
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
