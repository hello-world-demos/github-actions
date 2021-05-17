package io.github.helloworld.github.actions.githubactions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class GithubActionsApplication {

    public static void main(String[] args) {
        SpringApplication.run(GithubActionsApplication.class, args);
    }

}
