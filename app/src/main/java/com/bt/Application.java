package com.bt;

import com.bt.corejava.Overloading;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;

/**
 * Created by 611005913 on 12/14/2017.
 */
@SpringBootConfiguration
public class Application {

    public static void main(String[] args) {
        System.out.println("Mohit tesdddting");

        new Overloading().calculateTime();
        new Overloading().calculateTime(1);
        new Overloading().calculateTime(1,"3");

        System.exit(SpringApplication.exit(SpringApplication.run(Application.class, args)));
    }
}
