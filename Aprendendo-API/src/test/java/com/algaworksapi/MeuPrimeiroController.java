package com.algaworksapi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MeuPrimeiroController {
	
	@GetMapping
	@ResponseBody
	public String Hello() {
		return "hello!";
		
		
	}


}
