package com.servertech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api")
public class SumController {
	
	@Autowired
	private RestTemplate rt;
	
//	http://localhost:8182/api/20/30
	@GetMapping("/sum/{a}/{b}")
	public int add(@PathVariable("a")int a,@PathVariable("b")int b) {
		return rt.getForObject("http://localhost:8181/api/"+a+"/"+b, Integer.class);
	}//EOM
	
//	http://localhost:8182/api/sum?a=10&b=20
	@GetMapping("/sum")
	public int add1(@RequestParam("a")int a,@RequestParam("b")int b) {
		return rt.getForObject("http://localhost:8181/api/sum?a="+a+"&b="+b, Integer.class);
	}//EOM

}
