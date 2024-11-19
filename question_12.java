/* 12. Create a base class Distance which stores the distance between two locations in miles and a method travelTime(). The method prints the time taken to cover the distance when the speed is 60 miles per hour. Now in a derived class DistanceMKS, override travelTime() so that it prints the time assuming the distance is in kilometers and the speed is 100 km per second. Demonstrate the working of the classes. */

class Distance
{
	double distanceInMiles;
	void travelTime(double x)
	{   distanceInMiles=x;
		double time=distanceInMiles/60;
		System.out.println("The time taken to cover "+ distanceInMiles+"miles is "+time+" hours");
	}
}
class DistanceMKS extends Distance 
{
	void travelTime(double x)
	{   distanceInMiles=x;
		double time=distanceInMiles*1.609/100;
		System.out.println("The time taken to cover "+ distanceInMiles*1.609+ " km is"+ time+" hours when speed is 100 km per hour");
	}
}
public class MainClass12 {
	public static void main(String []args)
	{
		Distance D1 = new Distance();
		DistanceMKS D2 = new DistanceMKS();
		D1.travelTime(100);
		D2.travelTime(100);
	}

}
