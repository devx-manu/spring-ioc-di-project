package springcoreproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Mobile {
	
	public Mobile()
	{
	System.out.println("Mobile obj is created");	
	}

	@Autowired
	Sim sim;
	
	void insert()
	{
		sim.add();
	}
}
