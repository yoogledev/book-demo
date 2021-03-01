package me.library.library.account.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * Account
 *
 * @author uiseon.yu
 * @since 2021. 03. 01.
 */
@Getter
@Setter
public class Account {
	private Integer id;
	private  String name;
	private String password;
	private String email;
}
