package com.rakshith.dockerdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerDemo {
	@GetMapping("/{name}")
	public String getname(@PathVariable String name) {
		return "hello "+name;
	}

}
