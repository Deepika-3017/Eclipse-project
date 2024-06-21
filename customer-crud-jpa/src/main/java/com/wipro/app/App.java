package com.wipro.app;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;

import com.wipro.entity.Book;
import com.wipro.service.BookService;
import com.wipro.service.BookServiceImpl;

public class App {

//	private static CustomerService service = new CustomerServiceImpl();
	
	private static BookService service = new BookServiceImpl();
	
	public static void main(String[] args) {
//		service.addCustomer(new Customer(null, "Deepika","dee@gmail.com",9876543212l));
//		service.addCustomer(new Customer(null, "Priyanka","priya@gmail.com",9877643212l));
		
//		Customer customer1=service.getCustomerById(1);
//		System.out.println(customer1);
//		
//		Customer customer2=service.getCustomerById(1);
//		System.out.println(customer2);
		
//		List<Customer> customerList = service.getAllCustomers();
//		Iterator<Customer> iterator = customerList.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
		
//		Customer customer1=service.getCustomerById(1);
//		System.out.println("Before "+customer1);
//		customer1.setEmail("deepu@gmail.com");
//		String status = service.updateCustomer(customer1);
//		System.out.println(status);
//		customer1 = service.getCustomerById(1);
//		System.out.println(customer1);
		
//		String status = service.deleteCustomer(2);
//		System.out.println(status);
//		
//		List<Customer> customerList = service.getAllCustomers();
//		Iterator<Customer> iterator = customerList.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
		
//		
		
//		service.addBook(new Book(null,"Book1","OOPS",LocalDate.of(2001, 03, 30),1000.0));
//		service.addBook(new Book(null,"Book2","JAVA",LocalDate.of(2002, 05, 01),800.0));
//		service.addBook(new Book(null,"Book3","C++",LocalDate.of(2000, 01, 18),500.0));
//		service.addBook(new Book(null,"Book4","PYTHON",LocalDate.of(2005, 07, 02),7000.0));
//		
//		List<Book> bookList = service.getAllBooks();
//		Iterator<Book> iterator = bookList.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
		
//		List<Book> bookList=service.getBooksByAuthor("deepika");
//		Iterator<Book> iterator = bookList.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
		
//		List<Book> bookList=service.getBooksbyAuthorGreaterThanPrice("deepika", 1000.0);
//		Iterator<Book> iterator = bookList.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
		
		List<Book> bookList=service.fetchAllBooks();
		Iterator<Book> iterator = bookList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}

}
