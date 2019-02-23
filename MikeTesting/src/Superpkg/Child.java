package Superpkg;

public class Child extends father 
{
	public Child() 
	{ 
		super(10,10);
		//super(10,12);
		System.out.println("Default Child Constuctor");
	}
    Child(int a)
    {
    	//this(10,12);
    	System.out.println("Child One Parameter Constructor");
	}
    Child(int a,int b)
    {
    	super(10);
    	System.out.println("Child Two Parameter Constructor");
    }
    Child(int a,int b,int c)
    
    {
    	//this(10);
    	System.out.println("Child Three Parameter Constructor");
    }
    public static void main(String[] args) 
    {
    	new Child();
    	new Child(12,10);  	
		
	}
    
}

