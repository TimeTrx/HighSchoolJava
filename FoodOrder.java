import java.io.*;
//A foodOrder object is used for a resteraunt
//program to keep track of customers orders!

public class FoodOrder
{
    double myReservation;
    String order;
    double price;
    public static void main (String[] args) throws IOException
    {
	BufferedReader in = new BufferedReader (new InputStreamReader (System.in));

	//Create a new food object
	FoodOrder myReservation = new FoodOrder ();


      
	System.out.print ("What would you like to eat: ");

       
	myReservation.order = in.readLine ();


	System.out.print ("\n\nHow much would you like to pay: ");

      
	myReservation.price = Integer.valueOf (in.readLine ()).intValue ();


	//Output the reservation
	System.out.println ("\n\nYou ordered: " + myReservation.order + ", for $ " + myReservation.price + ", will see if we can get that for you.");
    }
}
