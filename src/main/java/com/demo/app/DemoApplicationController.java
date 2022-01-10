package com.demo.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoApplicationController {
	@GetMapping("/demo")
	public String demo() {
		return "Hello DJJJJJJ";
	}
}
