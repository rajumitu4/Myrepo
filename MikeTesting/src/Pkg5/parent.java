package Pkg5;

public class parent 
{
 //static int a;
 int a;
 public void method2()
 {
	 System.out.println("Parent Class Method");
 }
 public int method3(int a)
 {
	 this.a=a;
	// parent.a=a;
	 return a;
 }
 
}
