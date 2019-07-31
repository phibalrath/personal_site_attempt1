package com.tts.personalweb.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.tts.personalweb.Models.Contacts;
import com.tts.personalweb.Repository.ContactsRepository;

@Controller
public class IndexController {
	
	private ContactsRepository contactsRepository;
	
	@GetMapping(value="/")
	public String index() {
		return "index";
	}
	
	@GetMapping(value="/about") 
	public String about() {
		return "about";
	}
	
	@GetMapping(value="/education")
	public String education()  {
		return "education";
	}
	
	@GetMapping(value="/projects")
	public String projects() {
		return "projects";
	}
	
	@GetMapping(value="/contact-me")
	public String contact() {
		return "contact";
	}
	
	//Create Method to Submit each Contact Me Form
	@PostMapping(value="/contact-me")
	public String submit(Contacts contacts, Model model) {
		contactsRepository.save(contacts);
		//posts.add(Contacts);
		model.addAttribute("name", contacts.getName());
		model.addAttribute("email", contacts.getEmail());
		model.addAttribute("message", contacts.getMessage());
		return "result";
	}
}	