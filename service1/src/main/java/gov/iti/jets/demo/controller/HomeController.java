package gov.iti.jets.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service1")
public class HomeController {

    @GetMapping("/hello")
    public String sayHello() {

        return "hello yassin";
    }
}
