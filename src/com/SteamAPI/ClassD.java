package com.SteamAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ClassD 
{
	void meth1()
	{
		System.out.println("Implementing Stream API");
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(2);
		al.add(5);
		al.add(3);
		al.add(4);
		al.add(1);	
		
		System.out.println("Before : " + al);
		
		Collections.sort(al);
		Stream<Integer> s = al.stream().sorted();
		List<Integer> li = s.collect(Collectors.toList());
		
		System.out.println("After : " + li);
	
	}
	public static void main(String[] args) 
	{
		new ClassD().meth1();
	}
}
