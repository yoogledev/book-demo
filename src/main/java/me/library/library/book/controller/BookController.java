package me.library.library.book.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import me.library.library.book.dto.Book;
import me.library.library.book.service.BookService;

/**
 * BookController
 *
 * @author uiseon.yu
 * @since 2021. 03. 01.
 */

@RestController
@RequestMapping(value = "/book")
public class BookController {

	@Autowired
	BookService bookService;

	// All Read
	@GetMapping
	public List<Book> getBooks() {
		return bookService.getBooks();
	}

	// Create
	@PostMapping
	public Book createBook(@RequestParam Integer id, @RequestParam String name, @RequestParam String author, @RequestParam Integer price) {
		return bookService.createBook(id, name, author, price);
	}

	// Read
	@GetMapping(value = "/{id}")
	public Book getBook(@PathVariable Integer id) {
		return bookService.getBook(id);
	}

	// Update
	@PostMapping(value = "/{id}")
	public Book updateBook(@PathVariable Integer id, @RequestParam String name, @RequestParam String author, @RequestParam Integer price) {
		return bookService.updateBook(id, name, author, price);
	}

	// Delete
	@DeleteMapping(value = "/{id}")
	public void deleteBook(@PathVariable Integer id) {
		bookService.deleteBook(id);
	}

}
