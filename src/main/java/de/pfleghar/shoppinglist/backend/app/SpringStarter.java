package de.pfleghar.shoppinglist.backend.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "de.pfleghar.shoppinglist.backend")
public class SpringStarter {

    public static void main(String[] args) {
        SpringApplication.run(SpringStarter.class, args);
    }

}
