package com.example.testinggithub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/greetings")
public class TestingGitHubApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestingGitHubApplication.class, args);
    }

    @GetMapping
    public String initialGreeting() {
        return "Whoever you are, you are welcome!";
    }
}
