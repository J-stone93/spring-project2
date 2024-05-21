package com.example.demo.lombok;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookTest {

	@Test
	void 북테스트() {
		
		Book book1 = new Book();
		book1.setTitle("자바프로그래밍");
		book1.setPrice(15000);
		book1.setCompany("한빛소프트");
		book1.setPage(150);
		
		System.out.println(book1.getTitle());
		System.out.println(book1.getPrice());
		System.out.println(book1.getCompany());
		System.out.println(book1.getPage());
		
		Book book2 = new Book("바닐라스크립트", 20000, "소리마당", 200);
		System.out.println(book2.toString());
		
		Book book3 = Book.builder().title("DB와 SQL").price(25000).company("한빛소프트").page(120).build();
		System.out.println(book3.toString());
		
	}
	
}
