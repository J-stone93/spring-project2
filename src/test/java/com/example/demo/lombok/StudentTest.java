package com.example.demo.lombok;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class StudentTest {

	@Test
	void 학생테스트() {
		Student student1 = new Student();
		student1.setStudentID(1001);
		student1.setStudentName("둘리");
		student1.setAge(13);
		
		System.out.println(student1.getStudentID());
		System.out.println(student1.getStudentName());
		System.out.println(student1.getAge());
		
		Student student2 = new Student(1002, "또치", 12);
		
		System.out.println(student2.toString());
		
		Student student3 = Student.builder().studentID(1003).studentName("도우너").age(12).build();
		
		System.out.println(student3.toString());
	}
}
