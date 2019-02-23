package practicepkg;

public class Practice {
	private String Burger ="macD";
    public Practice(String F)
     {
    	 Burger=F;
     }
	public void Display() 
	{
		System.out.println(Burger);
	}
	public static void main(String[] args) 
	{
		Practice f1=new Practice("Hamburger");
		f1.Display();		
	}
}
