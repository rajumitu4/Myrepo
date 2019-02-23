package Pkg5;

public class Child extends parent
{
  public void method1()
  {
	  super.a=12; //super varibale
	 // a=12;             //Static Variable 
	  System.out.println(a);
	  super.method2();
	  System.out.println("Child Calls Method");
	  super.method3(14);
	  System.out.println(a);
  }
  public static void main(String[] args) 
  {
	Child obj=new Child();
	obj.method1();
	
  }
}
