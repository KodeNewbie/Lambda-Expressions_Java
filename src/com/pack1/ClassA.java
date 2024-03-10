package com.pack1;

public class ClassA 
{

	void display()
	{
		System.out.println("Implementing Lambda Expressions");
		
		InterfaceA x = ()-> System.out.println("First lambda expression executed");
		
		InterfaceB y = (int num1, int num2)->
		{
			if (num1 == num2)
				System.out.println("Numbers are equal");
			else
				System.out.println("Numbers are unequal");
		};
		y.meth2(10, 10);
		
		InterfaceC z = (int firstNum, int secondNum)->
		{
			if (firstNum <= 10)
			{
				System.out.println("If block executed");
				return 10;
			}
			else
			{
				System.out.println("Else block executed");
				return 9;
			}
		};
				
		int result = z.meth3(50,5);
		System.out.println("meth3() is returning : " + result);
		
	}
	
	public static void main(String[] args) 
	{
		new ClassA().display();
	}

}
