package com.abhi.demo;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class HomeController {
	List l = new ArrayList<>();
	@GetMapping("/home")
	public String home(HttpServletRequest req) {
		return "you are in home..";
		
	}
	
	@GetMapping("/users")
	public List<String> users(HttpServletRequest req) {
		l.add("Abhijit");
		l.add("deblina");
		return l;
	}
	
	@PostMapping("/adduser")
	public String usersadd(HttpServletRequest req,HttpServletResponse res, @RequestBody String user ) {
		l.add(user);
		return "user added";
	}
}
