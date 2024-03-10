package com.pack2;

import com.pack1.InterfaceA;

public class ClassA {

	void display() {
		System.out.println("Implementing Method Referencing");
		
		InterfaceA aobj1 = new ClassB()::show;
		InterfaceA aobj2 = ClassB::msg;
		InterfaceA aobj3 = ClassB::new;
		
		aobj1.meth1();
		aobj2.meth1();
		aobj3.meth1();
		
		InterfaceB bobj = ClassB::new ;
		bobj.meth2(1000);
	}
	
	public static void main(String[] args) {
		new ClassA().display();
	}
}
