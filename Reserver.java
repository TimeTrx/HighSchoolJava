import java.io.*;

public class Reserver
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		//Create a new reservation object
		Reservation myReservation = new Reservation();


		//Ask User what time they would like to  make the reservation
		System.out.print("For what time would you like to make a reservation? ");

		//Get input, store the string in object field "time"
		myReservation.time = in.readLine();


		//Ask how many people will be dining
		System.out.print("\n\nFor how many people? ");

		//Get input, convert it to an integer, and store it in
		//the object field "number"
		myReservation.number = Integer.valueOf( in.readLine() ).intValue();


		//Output the reservation
		System.out.println("\n\nYou have made a reservation at " + myReservation.time + ", for " + myReservation.number + " people");
	}
}


