package com.example.springbootgithubactions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootGitHubActionsApplication {

    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome to Spring Boot CI/CD with GitHub Actions Demo...!!!!";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootGitHubActionsApplication.class, args);
    }


    /*git init
    git add README.md
    git commit -m "first commit"
    git branch -M main
    git remote add origin https://github.com/devcode961/springboot-github-actions-docker.git
    git push -u origin main*/
}
