

import inheritance.father;
import inheritance.grandfather;

public class Child extends grandfather
{
	public void method2() 
	{
		System.out.println("Child Class Method");
	}
	public static void main(String[] args) {
		Child cs=new Child();
		cs.Method();
		cs.method2();
		father cs1=new father();
		cs1.method1();
	}
  
}
