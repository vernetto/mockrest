package com.example.mockrest;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class SpringTestConfig {

    @Bean
    public RestTemplate restTemplate() {
        // Do any additional configuration here
        return new RestTemplate();
    }

    @Bean
    public EmployeeService getEmployeeService() {
        return new EmployeeService();
    }
}
