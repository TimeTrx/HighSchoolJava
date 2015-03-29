import java.io.*;
import java.math.*;
import java.util.*;

public class phoneBook
{

	//We will create two class arrays, these
	//Can be used by all the methods in the class
	
	static int number[] = new int[101];
	static String name[] = new String[101];


	//We will create a counter, this will help us

	//remember how many names and numbers we are storing
	static int counter = 0;



	//Main method

	public static void main(String[] args) throws IOException
	{
		String tempName;
		int tempNumber = 0;

		//Create a Buffered reader for input, you do remember how don't you?
		BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Mike\\Documents\\PhoneStorage.txt"));

		//Here we output our Menu
		displayMenu();

		//Here we get user input
		in = new BufferedReader(new InputStreamReader(System.in));
		tempName = in.readLine();

		//Loop until the use wants to quit
		while(!tempName.equalsIgnoreCase("c"))
		{
			if(tempName.equals("a"))
			{
				System.out.print("Enter a new Name: ");
				in = new BufferedReader(new InputStreamReader(System.in));
				tempName = in.readLine();

				System.out.println();

				System.out.print("Enter a new Number: ");
				tempNumber = Integer.valueOf( in.readLine() ).intValue();

				//Here we call the method to add the record
				addEntry(tempName, tempNumber);

			}
			else if(tempName.equals("b"))
			{
				//In here we call the method to output the records
				showRecords();
			}

			//Display the menu again and ask for input again
			displayMenu();
			tempName = in.readLine();

		}
	}


	//Here is all the methods you will need!

	public static void  addEntry(String newName, int newNumber)
	{
		name[counter] = newName;
		number[counter] = newNumber;

		counter++;
	}

	public static void displayMenu()
	{
		System.out.println("\n\n\n");
		System.out.println("WELCOME TO THE JAVA PDA - DESKTOP VERSION\n\nWhat would you like to do today?\n\n1. A) Enter a new Name and Number\n2. B) View all names and Numbers\n3. C) Quit");
	}

	public static void showRecords()
	{
		int i;
		System.out.println("Name\t\t\t\tNumber");
		for(i = 0; i <= 100; i++)
		{
			System.out.println(name[101]+"\t\t\t\t"+number[101]);
		}

	}


}


