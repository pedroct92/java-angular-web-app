package com.spring.restapi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
*
* @author amanganiello90
*/
@Controller
public class AppController {

	@RequestMapping(value = { "/" })
	@ResponseBody
	public String redirect() {
		return "Hello World!";
	}

}
