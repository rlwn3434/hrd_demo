package com.example.demo.config;

import java.util.Calendar;
import java.util.Random;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import com.example.demo.Game;
import com.example.demo.ImageUtil;


@Configuration
@ComponentScan(basePackages = "com.example.demo")
@ImportResource("classpath:application.xml")
@ComponentScan(basePackageClasses = BeanConfig.class)
public class BeanConfig {
    @Bean
    public Game game(){
        return new Game();   
    }

    @Bean
    public ImageUtil imageUtil(){
        return new ImageUtil();
    }
    @Bean
    public Random bean2(){
        return new Random();
    }
    @Bean
    public Calendar bean3(){
        return Calendar.getInstance();
    }
    
}
