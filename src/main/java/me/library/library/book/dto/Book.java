package me.library.library.book.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Book
 *
 * @author uiseon.yu
 * @since 2021. 03. 01.
 */

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Book {
	private Integer id;
	private String name;
	private String author;
	private Integer price;
}
