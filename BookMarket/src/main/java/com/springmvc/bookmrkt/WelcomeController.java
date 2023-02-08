package com.springmvc.bookmrkt;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WelcomeController {
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String welcome(Model model) {
		model.addAttribute("greeting", "Welcome to BookMareket");
		model.addAttribute("strapline", "WelCome to Web Shopping Mall");
		model.addAttribute("testLine", "오히려 좋아");
		return "welcome";
	}
}
