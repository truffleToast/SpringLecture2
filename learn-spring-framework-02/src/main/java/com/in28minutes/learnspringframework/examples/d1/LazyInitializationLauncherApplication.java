package com.in28minutes.learnspringframework.examples.d1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotatedBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Component
class ClassA{
	
}

class ClassB{
	
	//Class A를 매개변수로 하는 생성자 호출하기
	private ClassA classA;
	
	public ClassB(ClassA classA) {
		System.out.println("Some Initializationg logic");
		this.classA = classA;
	}
}


@Configuration
@ComponentScan
public class LazyInitializationLauncherApplication {
	
	public static void main(String[] args) {
		try(var context = 
				new AnnotationConfigApplicationContext
				(LazyInitializationLauncherApplication.class)){
			Arrays.stream(context.getBeanDefinitionNames())
			.forEach(System.out::println);
		}
		
	}
}


