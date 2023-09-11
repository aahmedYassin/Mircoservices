package gov.iti.jets.demo2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.circuitbreaker.CircuitBreakerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.timelimiter.annotation.TimeLimiter;

import java.util.List;
@RestController
@RequestMapping("/service2")
public class HomeController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/hello")
    public String sayHello() {

        return "welcome yassin";
    }

    @GetMapping("/gomaa")
    @CircuitBreaker(name="gomaa")
    @TimeLimiter(name="gommaTime")
    public String sayWelcome() {

        String resourceUrl = "http://localhost:7777/service1/hello";
        
        ResponseEntity<String> response = restTemplate.getForEntity(resourceUrl, String.class);

        String message = response.getBody();
        return message;
    }


}
