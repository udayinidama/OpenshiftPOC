/**
 * 
 */
package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author syam
 *
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

	@GetMapping("/ping")
	public String ping() {
		return "pong!!!";
	}
}
