package practicepkg;

public class Variable 
{
  static String collage="Java Collage";   // Static Variable
  int std_id;                             //Instance or Global Variable
  
  
  public static void main(String[] args) 
  {
	  Variable v1=new Variable();
	  v1.std_id=101;
	  System.out.println("Student ID :" + v1.std_id + " Collage Name : " + collage);
  }
}
