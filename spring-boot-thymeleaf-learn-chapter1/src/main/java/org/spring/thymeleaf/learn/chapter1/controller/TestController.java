package org.spring.thymeleaf.learn.chapter1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("name", "thymeleaf");
		return "index";
	}
}
