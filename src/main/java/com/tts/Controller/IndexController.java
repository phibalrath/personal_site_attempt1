package com.tts.Controller;

//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
	@GetMapping(value="/")
	public String index() {
		return "index";
	}
	
	@GetMapping(value="/about") 
		public String about() {
			return "about";
		}
}