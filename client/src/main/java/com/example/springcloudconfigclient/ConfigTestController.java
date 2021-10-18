package com.example.springcloudconfigclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigTestController {

    @GetMapping("/config")
    public String string(@Value("${spring.datasource.url}") String dbUrl) {
        return dbUrl;
    }

}
