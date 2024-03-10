package com.SteamAPI;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class ClassC
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
		
		System.out.println("Before : " + al);
		System.out.println("After : " + al.stream().map(data->data*2).collect(Collectors.toList()));
	}
	public static void main(String[] args) 
	{
		new ClassC().meth1();
	}
}
