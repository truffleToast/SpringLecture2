package com.in28minures.learningframework.helloworld;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		
		//1. spring context 작성
		try(var context =
				new AnnotationConfigApplicationContext
				(HelloWorldConfiguration.class)){
		//2. spirng 설정파일 만들기
		//HelloWorldConfigutation - @Configuration
		// name =@Bean
		
		//3:Spring으로 만들어진 데이터 관리하기
		System.out.println(context.getBean("name")); //메서드 이름으로 불러오기
		
		System.out.println(context.getBean("age"));
		
		System.out.println(context.getBean("person"));
		
		System.out.println(context.getBean("address2"));
		
		System.out.println(context.getBean("person2MethodCall"));
		
		System.out.println(context.getBean("person3Parameters"));
		
		System.out.println(context.getBean(Person.class));
		System.out.println(context.getBean(Address.class));
		
		System.out.println(context.getBean("person5Qualifier"));
//		Arrays.stream(context.getBeanDefinitionNames())
//			.forEach(System.out::println); 
		}
		
	}

}
