package me.chadthompson.container.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CounterApplication {

    @RequestMapping("/")
    public String sayHello(){
        return "Hello from Docker";
    }

    public static void main(String[] args){
        SpringApplication.run(CounterApplication.class, args);
    }
}
