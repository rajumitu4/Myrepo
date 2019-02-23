package inheritance;

public class father extends grandfather
{ 
	public void method1() 
	{
		System.out.println("Father class Method");
	}
	public static void main(String[] args) 
	{
		father cs=new father();
		cs.Method();
		cs.method1();
	}
}
