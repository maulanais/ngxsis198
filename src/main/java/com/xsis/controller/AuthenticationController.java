package com.xsis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.xsis.model.X_Addrbook;
import com.xsis.model.X_Keahlian;
import com.xsis.model.X_Skill_Level;
import com.xsis.repository.X_AddrbookRepo;
import com.xsis.service.X_AddrbookService;



@Controller
public class AuthenticationController {
	
	@Autowired
	private X_AddrbookRepo addrrepo;
	
	@Autowired
	private X_AddrbookService addrscr;

	
	
	@GetMapping(value = "/changepassword/{bid}")
	public ModelAndView changepassword(@PathVariable("bid") Long id) {
		ModelAndView view = new ModelAndView("password/changepassword");
		
		
		X_Addrbook addrbook = this.addrrepo.findById(id).orElse(null);
		view.addObject("addrbook", addrbook);
		
		return view;
	}
	
	@PostMapping(value = "/changepassword/save")
	public ModelAndView savechangepassword( @ModelAttribute("addrbook") X_Addrbook addrbook) {
		ModelAndView view = new ModelAndView("password/changepassword");
		
		System.out.println(addrbook);
		 addrscr.simpanubahpwd(addrbook); 
		return view;
	}
	
	
	@GetMapping(value = "/forgotpassword/{fpToken}")
	public ModelAndView forgotpassword(@PathVariable("fpToken") String fpToken) {
		ModelAndView view = new ModelAndView("password/forgotpassword");
		
		
		
		  X_Addrbook addrbook = this.addrrepo.findByFpToken(fpToken);
		  System.out.println(addrbook);
		  view.addObject("addrbook", addrbook);
		 
		return view;
	}
	
	
	@PostMapping(value = "/forgotpassword/save")
	public ModelAndView saveforgotpassword( @ModelAttribute("addrbook") X_Addrbook addrbook) {
		ModelAndView view = new ModelAndView("password/changepassword");
		
		System.out.println(addrbook);
		 addrscr.simpanubahpwd(addrbook); 
		return view;
	}
}
