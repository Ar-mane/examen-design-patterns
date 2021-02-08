package com.example.design_patterns;

import com.example.design_patterns.Aspect.AppContext;
import com.example.design_patterns.Composite.Circle;
import com.example.design_patterns.Composite.Rectangle;
import com.example.design_patterns.Observer.Parametrage;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {
        AppContext.authenticateUser("ARACHE","ARACHE123",new String[]{"ADMIN"});
        SpringApplication.run(MainApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(Circle circle, Rectangle rectangle, Parametrage parametrage){
        return args -> {
            circle.surface();
            rectangle.perimetre();
            parametrage.add(circle);
            parametrage.add(rectangle);
            //observant Log.xml
        };
    }
}
