package my.project.example.userms.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping("//")
    public String teste() {
        return "index";
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
