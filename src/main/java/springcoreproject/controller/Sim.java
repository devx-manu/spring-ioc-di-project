package springcoreproject.controller;

import org.springframework.stereotype.Component;

@Component
public class Sim {
	
	public Sim()
	{
		System.out.println("sim object  is created");
	}

	void add()
	{
		System.out.println("Sim is inserted");
	}
}
