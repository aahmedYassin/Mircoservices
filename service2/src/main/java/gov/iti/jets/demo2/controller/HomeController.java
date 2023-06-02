package gov.iti.jets.demo2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service2")
public class HomeController {

    @GetMapping("/hello")
    public String sayHello() {

        return "welcome yassin";
    }
}
