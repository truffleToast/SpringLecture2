package com.in28minutes.springboot.learnspringboot;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConfigurationController {

	@Autowired
	private CurrencyServiceConfiguraion configuraion;
	
	@RequestMapping("/currency-configuration")
	public CurrencyServiceConfiguraion retreiveAllCourses() {
		return configuraion;
	}
}
