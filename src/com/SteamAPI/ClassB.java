package com.SteamAPI;

import java.util.ArrayList;

public class ClassB 
{
	void meth1()
	{
		System.out.println("Implementing Stram API");
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Tina");
		al.add("Sudha");
		al.add("Hema");
		al.add("Suji");
		al.add("Cristine");
		
		System.out.println("There are : "
				+ al.stream().filter(data->data.length()<=4).count()
				+ " elements whose length is <=4"
				);
	}
	public static void main(String[] args) 
	{
		new ClassA().meth1();
	}
}
