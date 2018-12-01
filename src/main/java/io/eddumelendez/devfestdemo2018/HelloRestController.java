package io.eddumelendez.devfestdemo2018;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

	@GetMapping("/hi")
	public String hi() {
		return "Hola DevFest 2018";
	}

}
