package com.SteamAPI;

import java.util.ArrayList;

public class ClassA 
{
	void meth1()
	{
		System.out.println("Implementing Stream API");
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		al.forEach(data->System.out.println(data));
	}
	public static void main(String[] args) 
	{
		new ClassA().meth1();
	}
}
