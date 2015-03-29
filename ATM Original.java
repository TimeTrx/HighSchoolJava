// The "ATM" class.
import java.io.*;
public class ATM
{
    static int Id[] = new int [15];
    static int balance[] = new int [15];
    static int op;
    static int Currency, red, deposit;
    public static void main (String[] args) throws IOException
    {

	BufferedReader inp, ing, Inu, ipn;
	String line, Input, ins, Pr, nput;
	int j;
	System.out.println ("Please Insert ID Card Number");
	inp = new BufferedReader (new InputStreamReader (System.in));
	ins = inp.readLine ();
	op = Integer.valueOf (ins).intValue ();
	BufferedReader it;
	BufferedReader in; //Creating 2 Buffered readers for input
	in = new BufferedReader (new FileReader ("accountData.txt"));
	line = in.readLine ();

	j = 0;
	while (line != null)
	{
	    Id [j] = Integer.valueOf (line).intValue ();
	    line = in.readLine ();
	    balance [j] = Integer.valueOf (line).intValue ();
	    line = in.readLine ();
	    if (op == Id [j])
	    {
		Currency = balance [j];
	    }
	    j++;
	}
	System.out.println ("Current Balance $" + Currency);
	System.out.println ("Menu");
	System.out.println ("1. Display Balance");
	System.out.println ("2. Withdraw Currency");
	System.out.println ("3. Deposit Currency");
	System.out.println ("4. Exit ATM");

	ing = new BufferedReader (new InputStreamReader (System.in));
	Input = ing.readLine ();
	while (!Input.equals ("4"))
	{
	    if (Input.equals ("1"))
	    {

		System.out.println ("Current Balance: $" + Currency);
		ing = new BufferedReader (new InputStreamReader (System.in));
		Input = ing.readLine ();

	    }
	    if (Input.equals ("2"))
	    {
		int Withdraw;
		System.out.print ("$");
		Inu = new BufferedReader (new InputStreamReader (System.in));
		Pr = Inu.readLine ();
		Withdraw = Integer.valueOf (Pr).intValue ();

		if (Currency < Withdraw)
		{
		    System.out.println ("Insufficient Funds");
		    ing = new BufferedReader (new InputStreamReader (System.in));
		    Input = ing.readLine ();
		}
		else
		{
		    Currency = Currency - Withdraw;
		    System.out.println ("Withdrawing: $" + Withdraw);
		    ing = new BufferedReader (new InputStreamReader (System.in));
		    Input = ing.readLine ();
		}

	    }
	    if (Input.equals ("3"))
	    {

		System.out.print ("$");
		ipn = new BufferedReader (new InputStreamReader (System.in));
		nput = ipn.readLine ();

		deposit = Integer.valueOf (nput).intValue ();
		Currency = Currency + deposit;
		System.out.println ("Depositing: $" + deposit);
		ing = new BufferedReader (new InputStreamReader (System.in));
		Input = ing.readLine ();

	    }
	}
	System.exit (0);
	

    }
} // main method
// ATM class


