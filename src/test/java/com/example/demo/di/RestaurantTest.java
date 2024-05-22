package com.example.demo.di;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest // (SpringBoot환경으로 만들어줌)컨테이너를 만들어주는 어노테이션이므로 없으면 빈(객체)을 담김
public class RestaurantTest {
	@Autowired // 컨테이너에서 빈(객체)을 찾아서 필드에 주입
	Restaurant restaurant;
	
	@Autowired
	Chef chef;
	
	@Test
	void 테스트() {
		
		//component로 컨테이너를 담으면 객체가 생성 되어 꺼내져 주소값이 있음
		System.out.println("restaurant:" + restaurant);
		System.out.println("chef: " + chef);
		System.out.println("getChef(): " + restaurant.getChef());
	}
	
}
