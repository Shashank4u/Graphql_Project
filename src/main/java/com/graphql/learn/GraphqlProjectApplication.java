package com.graphql.learn;

import com.graphql.learn.entities.Book;
import com.graphql.learn.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GraphqlProjectApplication implements CommandLineRunner{

	@Autowired
	private BookService bookService;

	public static void main(String[] args) {
		SpringApplication.run(GraphqlProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Book b1 = new Book();
		b1.setTitle("Complete Reference");
		b1.setDesc("For learning Java");
		b1.setPages(2000);
		b1.setPrice(5000);
		b1.setAuthor("XYZ");

		Book b2 = new Book();
		b2.setTitle("Head First Java");
		b2.setDesc("Beginner friendly Java book");
		b2.setPages(800);
		b2.setPrice(1200);
		b2.setAuthor("Kathy Sierra");

		Book b3 = new Book();
		b3.setTitle("Spring in Action");
		b3.setDesc("Learn Spring Framework");
		b3.setPages(1100);
		b3.setPrice(2200);
		b3.setAuthor("Craig Walls");

		Book b4 = new Book();
		b4.setTitle("Effective Java");
		b4.setDesc("Best practices for Java programming");
		b4.setPages(416);
		b4.setPrice(1500);
		b4.setAuthor("Joshua Bloch");

		Book b5 = new Book();
		b5.setTitle("Clean Code");
		b5.setDesc("A Handbook of Agile Software Craftsmanship");
		b5.setPages(464);
		b5.setPrice(1700);
		b5.setAuthor("Robert C. Martin");

		this.bookService.create(b1);
		this.bookService.create(b2);
		this.bookService.create(b3);
		this.bookService.create(b4);
		this.bookService.create(b5);

	}
}
