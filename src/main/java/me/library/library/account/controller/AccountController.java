package me.library.library.account.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * AccountController
 *
 * @author uiseon.yu
 * @since 2021. 03. 01.
 */

@RestController
@RequestMapping(value = "/account")
public class AccountController {

	@GetMapping(value = "/{id}")
	public String getAccount(@PathVariable String id) {
		return "Account\n id : "+id;
	}
}
