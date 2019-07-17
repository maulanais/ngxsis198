package com.xsis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthenticationController {

	@GetMapping(value = "/changepassword")
	public String changepassword() {
		return ("password/changepassword");
	}
}
