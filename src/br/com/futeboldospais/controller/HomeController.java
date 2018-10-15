package br.com.futeboldospais.controller;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "/")
public class HomeController {

	@RequestMapping(value = "home")
	public String home() {
		return "index";
	}
}
