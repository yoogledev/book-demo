package me.library.library.book.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

import me.library.library.book.dto.Book;

/**
 * BookRepository
 *
 * @author uiseon.yu
 * @since 2021. 03. 01.
 */

@Repository
public class BookRepository {
	private static Map<Integer, Book> books = new HashMap<>();

	public BookRepository() {
		books.put(1, new Book(1, "Spring Book 1", "Uiseon Yu", 30000));
		books.put(2, new Book(2, "Spring Book 2", "Hyungjun Park", 5000));
		books.put(3, new Book(3, "Spring Book 3", "Pig Park", 25000));
	}

	public List<Book> getBooks() {
		return new ArrayList<>(books.values());
	}

	public void addBook(Book book) {
		books.put(book.getId(), book);
	}

	public Book getBook(Integer id) {
		return books.get(id);
	}

	public void updateBook(Book newBook) {
		books.put(newBook.getId(), newBook);
	}

	public void deleteBook(Integer id) {
		books.remove(id);
	}
}
