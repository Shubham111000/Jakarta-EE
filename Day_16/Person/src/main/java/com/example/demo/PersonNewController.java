package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class PersonNewController
{
	@GetMapping("person")
	public String before()
	{
 		return "person";
	}
	
	
	@PostMapping("view")
	public String afterSubmit(@RequestParam("Address") String address,@RequestParam("PersonName") String name, @RequestParam("Age") int age,Model model) 
	{
		Person p1=new Person();
		p1.setAddress(address);
		p1.setAge(age);
		p1.setName(name);
		
		model.addAttribute("p1",p1);
		return "View";
	}
}
