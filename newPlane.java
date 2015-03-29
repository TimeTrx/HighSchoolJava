// The "Example" class.
public class Example
{
int newplane.speed;
    public static void main (String[] args)
    {
	//newPlane is the name of the object,
	//you can use any name you want!
	plane newPlane = new plane ();
	newplane.speed = 100;
	newplane.passengers = 5;
	newplane.type = "Concorde";

	System.out.print ("We made a " + newPlane.type + " that holds ");
	System.out.println (newPlane.passengers + " people, ");
	System.out.println (" and travels " + newPlane.speed + "mph");
    } // main method
} // Example class
