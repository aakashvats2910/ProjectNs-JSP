package com.aakash.projectns.projectns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ProjectnsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectnsApplication.class, args);
    }

}
