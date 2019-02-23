
public class test1 
{
	public void dispaly(int a, int b) 
	{
		int result=a*b;
		System.out.println("Result is " + result);
	}
   public int Additon(int a,int b)
   {
	int Result=a+b;
	return Result;
   }
   int subtraction(int a, int b) 
   {
	   int Result=a-b;
	   return Result;
   }
   public static void main(String[] args) {
	 test1 ts=new test1();
	 int a =  ts.Additon(10, 20);
	 int b = ts.subtraction(10, 5);	
	 ts.dispaly(a,b);	
}
}

