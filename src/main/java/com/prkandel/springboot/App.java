package com.prkandel.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by prkandel on 6/14/17.
 */

@EnableAutoConfiguration
@ComponentScan("com.prkandel.springboot")
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
