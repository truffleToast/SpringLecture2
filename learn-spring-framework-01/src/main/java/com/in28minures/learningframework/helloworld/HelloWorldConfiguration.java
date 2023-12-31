package com.in28minures.learningframework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

//Eliminate verbosity in creating Java Beans
//Public accessor methods, constructors,
//equals , hashcode and toString are automatically created.
//record -> Released in JDK 16+;  -> Setter getter 필요없음
record Person(String name, int age, Address address) {};

//Address - firstLine & city
record Address(String firstLine, String city) {}; 

@Configuration
public class HelloWorldConfiguration {
	
	@Bean //Bean을 통해 객체화
	public String name() {
		return "Ranga";
	}
	@Bean 
	public int age() {
		return 15;
	}
	
	@Bean
	public Person person() {
		return new Person("Ravi", 20, new Address("Baker Street", "London"));
	}
	
	@Bean
	public Person person2MethodCall() {
		return new Person(name(), age(), address()); //name, age 같은 클래스의 Ranga, 15 불러오기
	}
	
	@Bean
	public Person person3Parameters(String name, int age, Address address3) {
		//name , age, address2
		return new Person(name, age, address3); //name, age 같은 클래스의 Ranga, 15 불러오기
	}
	
	@Bean
	@Primary
	public Person person4Parameters(String name, int age, Address address) {
		return new Person(name, age, address);
	}
	@Bean
	public Person person5Qualifier(String name, int age, @Qualifier("address3Qualifier")Address address) {
		return new Person(name, age, address);
	}
	@Bean(name ="address2")
	@Primary
	public Address address() {
		return new Address("Baker Street", "London");
	}
	
	@Bean(name ="address3")
	@Qualifier("address3Qualifier")
	public Address address3() {
		return new Address("Motinagar", "Hderabad");
	}
	
 }
