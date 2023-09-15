package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
	
	@GetMapping("/")
	@ResponseBody
	String helloWorld() {
		return "Hello, world!";
	}
	
	@GetMapping("/team")
	public String team() {
		return "team";
	}
	
	@GetMapping("/yarik")
	public String yarik() {
		return "yarik";
	}
	
	@GetMapping("/vadim")
	public String vadim() {
		return "vadim";
	}
	
	@GetMapping("/nika")
	public String nika() {
		return "nika";
	}
	
	@GetMapping("/dasha")
	public String dasha() {
		return "dasha";
	}
}
