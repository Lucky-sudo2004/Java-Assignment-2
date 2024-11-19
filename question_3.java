/* 3. Write a Java program to show parameterized constructor. */

class ParameterizedConstructorImplementation
{
	public ParameterizedConstructorImplementation(int x,int y)
	{
		int z=x+y;
		System.out.println("PARAMETRIZED CONSTRUCTOR IS CALLED.");
		System.out.println("SUM OF INTEGERS PASSED IS:"+z);
	}
}
public class Main {
	public static void main(String []args)
	{
		ParameterizedConstructorImplementation a= new ParameterizedConstructorImplementation(4,5);
	}

}
