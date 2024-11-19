/* 13. Write a Java program to explain “multilevel inheritance.” */

class Animals
{
	void Method1()
	{
		System.out.println("There are wide variety of animal species on planet earth");
	}
}
class Cat extends Animals
{
	void Method2()
	{
		System.out.println("Cats are the animals that live on land");
	}
}
class Tiger extends Cat
{
	void Method3()
	{
		System.out.println("Tiger belongs to cat family");
	}
}
public class MainClass13 {
	public static void main(String []args)
	{
		Tiger T1 = new Tiger();
		T1.Method1();//Method of animal class.
		T1.Method2();//Method of cat class.
		T1.Method3();//Method of Tiger class.

	}

}
