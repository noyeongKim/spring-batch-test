package com.kino.springbatchtest;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableBatchProcessing  // spring batch 사용을 위한 어노테이션 추가
public class SpringBatchTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBatchTestApplication.class, args);
    }

}
