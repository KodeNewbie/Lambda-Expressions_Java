package com.pack2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;

public class ClassB {
	void show() {
		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
		map.put("Java", 100);
		map.put("AWS", 200);
		map.put("Oracle", 300);
		map.put("Spring", 400);
		map.put("Snowflake", 500);
		
		String arr[] = new String [map.size()];
		
		ArrayList<String> al = new ArrayList<String>(map.keySet());
		for(int i = 0; i <= arr.length - 1 ; i++ )
		{
			arr[i] = al.get(i);
		}
		System.out.println("Array Elements : " + Arrays.toString(arr));
		
		for ( String word: arr)
		{
			System.out.println(word);
		}
	}
	static void msg() {
		System.out.println("\nJava is awesome");
	}
	
	ClassB(){
		System.out.println("\nConstructor referencing");
	}
	ClassB(int x)
	{
		System.out.println("x ===>"+x);
	}
}
