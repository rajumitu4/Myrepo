package Superpkg;

public class father {
	public father() 
	{
		//this(10,20,30);
       System.out.println("Default Father Constuctor");
	}
    father(int a)
    {
    	//this();
    	System.out.println("Father One Parameter Constructor");
	}
    father(int a,int b)
    {
    	//this(10);
    	System.out.println("Father Two Parameter Constructor");
    }
    father(int a,int b,int c)
    {
    	System.out.println("Father Three Parameter Constructor");
    }

}
