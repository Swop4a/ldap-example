package com.swop4a.ldap.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author swop4a
 * @since 05/03/2019 22:22
 */
@RestController
public class BaseController {

	@GetMapping("/")
	public String hello() {
		return "Hello world!";
	}
}