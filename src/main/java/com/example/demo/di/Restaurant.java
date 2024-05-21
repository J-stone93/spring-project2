package com.example.demo.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Restaurant {

	// Component로 컨테이너에 클래스를 담고 Aotowired로 컨테이너에서 꺼내 쓴다
	// 즉 클래스 한번 생성으로 여러군데서 객체(주소값 생김)로 갖다 쓸 수 있어서 데이터 낭비를 줄일 수 있다
	// 여러군데에서 사용하는 것을 교체하기가 용이해서 사용을 많이함
	// 1. 직접 필요한 객체를 생성하는 방식
	Chef chef1 = new Chef();
	
	// 2. 필요한 객체를 컨테이너에서 꺼내서 사용하는 방식 (의존성주입)
	@Autowired
	Chef chef2;
	
	public Chef getChef() {
		return chef2;
	}
}
