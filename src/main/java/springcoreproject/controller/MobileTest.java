package springcoreproject.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MobileTest {
public static void main(String[] args) {
	
	ApplicationContext applicationcontext=new AnnotationConfigApplicationContext(Config.class);
	Mobile mobile=applicationcontext.getBean(Mobile.class);
	mobile.insert();
}
}
