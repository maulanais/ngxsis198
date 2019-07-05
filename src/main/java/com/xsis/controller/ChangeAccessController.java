package com.xsis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChangeAccessController {
	@RequestMapping("/changeaccess")
	public String changeaccess() {
		return "changeaccess";
	}

}
