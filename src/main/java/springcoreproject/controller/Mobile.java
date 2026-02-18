package springcoreproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
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
