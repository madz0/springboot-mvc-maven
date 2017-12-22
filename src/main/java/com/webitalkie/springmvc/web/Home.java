package com.webitalkie.springmvc.web;

import java.util.Map;
import java.util.UUID;

import javax.persistence.criteria.Root;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webitalkie.springmvc.model.Contacts;
import com.webitalkie.springmvc.service.ContactService;
import com.webitalkie.springmvc.service.CustomerService;
import com.webitalkie.springmvc.utils.Incrementer;

import myjpa.model.Person_;

@Controller
@RequestMapping("/home")
public class Home extends Base {
	
	@Autowired
	private ContactService contactService;
	@Autowired
	private CustomerService customerService;

	@Autowired
	private HttpSession session;
	
	/*@GetMapping(path = "")
    public String indexWithNoSlash(Map<String, Object> model) {
		
		return index(model);
    }*/
	
	@GetMapping(path = "")
    public String indexWithNoSlash() {
		
		return "redirect:/home/";
    }
	
	@GetMapping(path = "/")
    public String index(Map<String, Object> model) {
		
		model.put("message", "ohoooy");
		session.setAttribute("test", "hi");
		
		return "home/index";
    }
	
	@GetMapping(path = "/about")
    public String about(Map<String, Object> model) {
		
		model.put("message", "about");
		return "home/about";
    }
	
	@GetMapping(path = "/get/{id}")
    public String get(@PathVariable("id") UUID uuid) {
        
		return "Hi_"+uuid;
    }
	
	@GetMapping(path = "/contactus")
    public String contactUs(Map<String, Object> model) {
		
		model.put("message", "Contact Us");
		model.put("contacts", new Contacts());
		model.put("idx", new Incrementer());
		model.put("sesstest", session.getAttribute("test"));
		return "home/contactUs";
    }

	@PostMapping(path = "/savecontactus")
    public String saveContactus(@ModelAttribute("contacts") Contacts contacts) {

		System.out.println("contacts:"+contacts);
		try {

			contactService.saveContacts(contacts.getContacts());
		} catch (Exception e) {
			
			return "redirect:/home/";
		}
		
		return "redirect:/home/contactus";
    }
	
	public String getCustomers() {
		
		try {

			customerService.find((root, q, cb)->{});
			
		} catch (Exception e) {
			
			return "redirect:/home/";
		}
		
		return "home/customers";
	}
}
