/* 11. 10. Write a Java program which creates a base class Num and contains an integer number along with a method shownum() which displays the number. Now create a derived class HexNum which inherits Num and overrides shownum() which displays the hexadecimal value and octal value of the number. Demonstrate the working of the classes. */

import java.util.*;
class Num
{
	int a;

	void shownum(int x)
	{   a=x;
		System.out.println("The number is : "+a);
	}
}
class HexNum extends Num
{   
	void shownum(int a)
	{ 
		String str=Integer.toHexString(a);
		String str1=Integer.toOctalString(a);
		System.out.println("The number in Hexa decimal form: "+str);
		System.out.println("The number in octal number System is: "+str1);
		
	}
}
public class MainClass11 {
	public static void main(String []args)
	{
		HexNum A1= new HexNum();
		A1.shownum(70);
		
	}

}
