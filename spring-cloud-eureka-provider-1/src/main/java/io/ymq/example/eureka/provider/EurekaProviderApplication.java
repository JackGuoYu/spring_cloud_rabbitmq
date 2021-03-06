package io.ymq.example.eureka.provider;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@EnableEurekaClient
@SpringBootApplication
public class EurekaProviderApplication {

	@Value("${guoyu}")
	String hello;
	
	@RequestMapping(value="/hello")
	public String hell() {
		return hello;
	}
    
    public static void main(String[] args) {
        SpringApplication.run(EurekaProviderApplication.class, args);
    }
}
