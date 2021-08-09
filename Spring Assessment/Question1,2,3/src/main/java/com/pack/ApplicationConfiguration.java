package com.pack;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pack.DemoManager;
import com.pack.DemoManagerImpl;

@Configuration
public class ApplicationConfiguration {
	
	@Bean(name="demoService")
    public DemoManager helloWorld() {
        return new DemoManagerImpl();
    }

}
