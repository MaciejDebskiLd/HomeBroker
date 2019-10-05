package com.example.homebroker;

import com.example.homebroker.utils.BootStrap;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class HomebrokerApplication {

	private BootStrap bootStrap;

	public HomebrokerApplication(BootStrap bootStrap){
		this.bootStrap = bootStrap;
	}

	@PostConstruct
	public void init(){
		bootStrap.initializeRepository();
	}

	public static void main(String[] args) {
		SpringApplication.run(HomebrokerApplication.class, args);
	}

}
