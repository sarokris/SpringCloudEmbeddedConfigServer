package com.ilearn.spring.ConfigServer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/conf")
public class ConfigReader {
	@Value("${message}")
	private String message;
	
	@GetMapping
    public String getMessage() {
        return message;
    }

}
