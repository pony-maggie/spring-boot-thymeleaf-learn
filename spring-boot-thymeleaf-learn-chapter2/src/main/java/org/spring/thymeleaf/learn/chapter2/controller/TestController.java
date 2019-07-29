package org.spring.thymeleaf.learn.chapter2.controller;

import org.spring.thymeleaf.learn.chapter2.entity.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {

	@RequestMapping("/add")
	public String add(Model model) {
		model.addAttribute("book", new Book());
		return "addBook";
	}

	@RequestMapping(value = { "/saveBook" }, method =  RequestMethod.POST)
	public String saveBook(Book book) {

		System.out.println("书名:" + book.getName());
		System.out.println("作者:" + book.getAuthor());

		return "result"; //返回结果页面
	}
}
