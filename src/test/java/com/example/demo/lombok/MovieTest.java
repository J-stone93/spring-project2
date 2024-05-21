package com.example.demo.lombok;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MovieTest {

	@Test
	void 무비테스트() {
		Movie movie1 = new Movie();
		
		movie1.setTitle("쥬라기공원");
		movie1.setDirector("제임스카멜론");
		movie1.setDate(LocalDate.of(1980, 01, 13));
		// LocalDate는 타임존까지 표시가능 사용지향 .of로 인자값 3개로 사용하면 됨
		System.out.println(movie1.getTitle());
		System.out.println(movie1.getDirector());
		System.out.println(movie1.getDate());
		
		Movie movie2 = new Movie("다크나이트", "크리스토퍼놀란", LocalDate.of(2007, 07, 06));
		
		System.out.println(movie2.toString());
		
		Movie movie3 = Movie.builder().title("기생충").director("봉준호").date(LocalDate.of(2020, 12, 07)).build();
				
		System.out.println(movie3.toString());
	}
}
