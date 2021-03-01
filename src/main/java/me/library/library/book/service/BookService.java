package me.library.library.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.library.library.book.dto.Book;
import me.library.library.book.repository.BookRepository;

/**
 * BookService
 *
 * @author uiseon.yu
 * @since 2021. 03. 01.
 */

@Service
public class BookService {

	@Autowired
	BookRepository bookRepository;

	public List<Book> getBooks() {
		return bookRepository.getBooks();
	}

	public Book createBook(Integer id, String name, String author, Integer price) {
		Book book = new Book(id, name, author, price);
		bookRepository.addBook(book);
		return getBook(book.getId());
	}

	public Book getBook(Integer id) {
		return bookRepository.getBook(id);
	}

	public Book updateBook(Integer id, String name, String author, Integer price) {
		Book newBook = new Book(id, name, author, price);
		bookRepository.updateBook(newBook);
		return getBook(newBook.getId());
	}

	public void deleteBook(Integer id) {
		bookRepository.deleteBook(id);
	}
}