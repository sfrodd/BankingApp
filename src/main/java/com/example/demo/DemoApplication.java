package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {

		//SpringApplication.run(DemoApplication.class, args);
		Bank b=new Bank();
		SBAccount sb=new SBAccount("SBAccount",5000.00f);
		RDAccount rd=new RDAccount(10000.00f);
		System.out.println(b.computeInterest(sb));
		System.out.println(b.computeInterest(rd));
	}

	@GetMapping("/hello")
	public String sayHello(@RequestParam(value="myName",defaultValue = "World") String name){

		return String.format("Hello %s",name);
	}

}
