package com.wipro.service;

import java.util.List;

import com.wipro.dao.BookDAO;
import com.wipro.dao.BookDAOImpl;
import com.wipro.entity.Book;

public class BookServiceImpl implements BookService{
	
	private BookDAO bookDAO = new BookDAOImpl();

	@Override
	public Book getBookById(Integer isbn) {
		
		return bookDAO.getBookById(isbn);
	}

	@Override
	public List<Book> getAllBooks() {
		
		return bookDAO.getAllBooks();
	}

	@Override
	public String addBook(Book book) {
		return bookDAO.addBook(book);
	}

	@Override
	public String updateBook(Book book) {
		return bookDAO.updateBook(book);
	}

	@Override
	public String deleteBook(Integer isbn) {
		return bookDAO.deleteBook(isbn);
	}

	@Override
	public List<Book> getBooksByAuthor(String author) {
		
		return bookDAO.getBooksByAuthor(author);
	}

	@Override
	public List<Book> getBooksbyAuthorGreaterThanPrice(String author, Double price) {
		return bookDAO.getBooksbyAuthorGreaterThanPrice(author, price);
				
	}

	@Override
	public List<Book> fetchAllBooks() {
		
		return bookDAO.fetchAllBooks();
	}

}
