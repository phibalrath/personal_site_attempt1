package com.tts.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class IndexController {
	@GetMapping(value="/")
	public String index() {
		return "index";
	}
	
	@GetMapping(value="/about")
	public String abouts() {
		return "/template/about.html";
	}
	
	@GetMapping(value="/education")
	public String educations() {
		return "education";
	}
	
	@PostMapping(value="/")
	public String returnIndex() {
		return "index";
	}
	
	@PostMapping(value="/about")
	public String returnAbout() {
		return "about";
	}
}