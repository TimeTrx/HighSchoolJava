// The "ATM" class.
import java.io.*;
public class ATM //Version 3.5
{
    static int Id[] = new int [15];
    static int balance[] = new int [15];//Static variables
    static int op;
    static int Currency, red, deposit, Withdraw;
    public static void main (String[] args) throws IOException
    {

	BufferedReader inp, ing, Inu, ipn;
	String line, Input, ins, Pr, nput;
	int j;
	System.out.println ("Please Insert ID Card Number");//Tells the user to insert card number
	inp = new BufferedReader (new InputStreamReader (System.in));
	ins = inp.readLine ();
	if (ins.equals (""))//If a blank entry is inputted it will output an error and shut the program down
	{
	    System.out.println ("Error Card ID Corrupt!!!! SHUT DOWN IMMINENT!!!!");//Warning message
	    System.exit (0);
	}

	op = Integer.valueOf (ins).intValue ();//converts the string input into an integer
	BufferedReader it;
	BufferedReader in; //Creating 2 Buffered readers for input
	in = new BufferedReader (new FileReader ("accountData.txt"));//reads the file were the accounts are stored
	line = in.readLine ();

	j = 0;
	while (line != null)//This will read the lines until there is nothing left to read.
	{
	    Id [j] = Integer.valueOf (line).intValue ();//This read and sorts the first line
	    line = in.readLine ();
	    balance [j] = Integer.valueOf (line).intValue ();//This sorts and reads the second line
	    line = in.readLine ();
	    if (op == Id [j])
	    {
		Currency = balance [j];//This sets the bank account selection as the balance 

	    }

	    j++;
	}
	if (Currency == 0)//This shuts the system down if the card ID is not found (System hacking attempt or an error)
	{
	    System.out.println ("ID Card Not Found!! Shut Down Imminent!!!!!");
	    System.exit (0);//Exits the program 
	}
	else
	{
	    System.out.println ("Current Balance $" + Currency);//Displays the current account balance
	    System.out.println ("Menu");
	    System.out.println ("1. Display Balance");
	    System.out.println ("2. Withdraw Currency");//The Menu
	    System.out.println ("3. Deposit Currency");
	    System.out.println ("4. Exit ATM");

	    ing = new BufferedReader (new InputStreamReader (System.in));
	    Input = ing.readLine ();//Input for the menu
	    while (!Input.equals ("4"))//Input for 4 will cause the loop to end
	    {
		if (Input.equals ("1"))//If input is 1
		{

		    System.out.println ("Current Balance: $" + Currency);
		    ing = new BufferedReader (new InputStreamReader (System.in));//This will display the currency and ask for a new command to be entered
		    Input = ing.readLine ();

		}
		if (Input.equals ("2"))//If input is 2
		{

		    System.out.print ("$");
		    Inu = new BufferedReader (new InputStreamReader (System.in));
		    Pr = Inu.readLine ();
		    Withdraw = Integer.valueOf (Pr).intValue ();//Ask how much to withdraw

		    if (Currency < Withdraw)//Checks to see if the amount to be taken out is more than the client has in the account
		    {
			System.out.println ("Insufficient Funds");
			ing = new BufferedReader (new InputStreamReader (System.in));//Tells us that we have overdrawn the amount in our account
			Input = ing.readLine ();
		    }

		    else
		    {
			Currency = Currency - Withdraw;
			System.out.println ("Withdrawing: $" + Withdraw);
			ing = new BufferedReader (new InputStreamReader (System.in));//This will display the amount of cash withdrawn and ask for a new command to be entered
			Input = ing.readLine ();
		    }

		}
		if (Input.equals ("3"))//If input is 3
		{

		    System.out.print ("$");
		    ipn = new BufferedReader (new InputStreamReader (System.in));
		    nput = ipn.readLine ();//Asks how much will be deposited

		    deposit = Integer.valueOf (nput).intValue ();
		    Currency = Currency + deposit;
		    System.out.println ("Depositing: $" + deposit);//This will display the amount of cash deposited and ask for a new command to be entered
		    ing = new BufferedReader (new InputStreamReader (System.in));
		    Input = ing.readLine ();
		}
		else//This will ask for another selection if an option is entered that shouldn't be
		{
		    System.out.println ("Invalid Selection, Please Enter Another Selection");
		    ing = new BufferedReader (new InputStreamReader (System.in));//This will ask for another command
		    Input = ing.readLine ();
		}

	    }
	}
	System.out.println ("System Shutting Down, Have A Nice Day!");
	System.exit (0);//Exit System and ending statement
    }
//Future Updates Will Include: A teller system that can add, delete and modify accounts.
 


}



