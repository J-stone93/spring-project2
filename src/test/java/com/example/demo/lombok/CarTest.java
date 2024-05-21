package com.example.demo.lombok;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CarTest {
	
	@Test
	void 카테스트() {
		Car car1 = new Car();
		
		car1.setCarName("K5");
		car1.setBrand("기아");
		car1.setColor("흰색");
		
		System.out.println(car1.getCarName());
		System.out.println(car1.getBrand());
		System.out.println(car1.getColor());
		
		Car car2 = new Car("제네시스", "현대", "검은색");
		System.out.println(car2.toString());
		
		Car car3 = Car.builder().carName("X7").brand("BMW").color("회색").build();
		System.out.println(car3.toString());
	}
}
