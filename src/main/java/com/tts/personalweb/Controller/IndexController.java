package com.tts.personalweb.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;

@Controller
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