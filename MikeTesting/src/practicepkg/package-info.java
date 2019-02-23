
package practicepkg;

class Food 
{
	private String Burger;
    public Food(String F)
     {
    	 Burger=F;
     }
	public void Display() 
	{
		System.out.println(Burger);
	}
	public static void main(String[] args) 
	{
		Food f1=new Food("Hamburger");
		f1.Display();
		
	}
}