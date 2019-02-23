package practicepkg;

public class Assignment3 
{
	public void m1() 
	{
       System.out.println("Method 1");	
       //this.m4();      
	}
	public void m2() 
	{	
       System.out.println("Method 2");		
	}
	public void m3() 
	{
       System.out.println("Method 3");		
       this.m1();
       this.m4();
       this.m2();
	}
	public void m4() 
	{
       System.out.println("Method 4");	
       //this.m2();
	}
	public static void main(String[] args) {
		Assignment3 Obj=new Assignment3();
		Obj.m3();
	}
}
