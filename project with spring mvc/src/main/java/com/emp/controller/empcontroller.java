package com.emp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.emp.services.empmanager;

@Controller
public class empcontroller {
	@Autowired
	empmanager manager;
	/*
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getallemp(Model model)
	{
		model.addAttribute("empl", manager.getallemp());
		return "empdetails";
	}*/
	
	@RequestMapping(value = "/")
	public String welcome()
	{
		return "home";
	}
	
	@RequestMapping(value = "/login")
	public String login()
	{
		return "login";
	}
	
	@RequestMapping(value = "/reg")
	public String reg()
	{
		return "reg";
	}
	
	@RequestMapping(value = "/contact")
	public String contact()
	{
		return "contact";
	}
	
	@RequestMapping(value = "/allproduct")
	public String allproduct()
	{
		return "allproduct";
	}
	
	@RequestMapping(value = "/cart")
	public String cart()
	{
		return "cart";
	}
}

