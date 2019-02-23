package practicepkg;

public class Constructor 
{
 public Constructor()
 {	 this(11,22,33);
	 System.out.println("Default Constructor");
 }
 public Constructor(int a)
 {	 
	 this(33,11);
	 System.out.println("1 Peramiterized Constructor");
 }
 public Constructor(int a,int b)
 {
	 this();
	 System.out.println("2 Peramiterized Constructor");
 }
 public Constructor(int a,int b,int c)
 {
	 System.out.println("3 Peramiterized Constructor");
 }
 
 public static void main(String[] args)
     {
	    new Constructor(10);
     }
 
}
