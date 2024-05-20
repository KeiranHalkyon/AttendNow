package com.thinkxfactor.attendNow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
public class AttendNowApplication {

	public static void main(String[] args) {
		SpringApplication.run(AttendNowApplication.class, args);
	}

}

// Hello World API

@RestController
@RequestMapping("/api")
class TestController {

	@GetMapping("/hello")
	public String hello() {
		System.out.println("Welcome to Hello World API");
		return "Hello, World from controllers!!";
	}

	@GetMapping("/test")
	public String test() {
		return "Hello from test method!!";
	}

	public String login(String username, String password) {
		// Logic for login
		return "Login Successful";
		// return "Login Failed";
	}

	@GetMapping("/tests/{name}/{dept}/{year}")
	public String testNames(String dept, String name,@PathVariable("year") byte yr){
		return "Hello there " + name + dept + yr;
	}
	// @GetMapping("/tests/{name}")
	// public String testNames(@PathVariable String name){
	// 	return "Hello there " + name;
	// }

	@GetMapping("/evenMoreTest")
	public String moreTests(String t1, boolean t2){
		return t1+" "+t2;
	}
}
