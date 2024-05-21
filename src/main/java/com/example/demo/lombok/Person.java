package com.example.demo.lombok;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// 어노테이션중에 lombok은 클래스 위에 위치함
//@Data Data어노테이션은 Getter Setter ToString을 포함한 어노테이션
@Getter
@Setter
@ToString
@NoArgsConstructor // 생성자 매개변수가 없는 디플트 생성자
@AllArgsConstructor // 생성자 멤버변수 초기화 시키는 생성자
@Builder // 생성자
public class Person {

	String name;
	int age;
	
}
