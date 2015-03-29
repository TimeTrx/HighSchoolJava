// The "ChequingAccount" class.
import java.io.*;
public class ChequingAccount
{
    double amount;
    double accountBalance;
    ChequingAccount (double balance) throws IOException
    {
	accountBalance = balance;
    }


    public double processDeposit (double deposit) throws IOException
    {
	accountBalance = accountBalance + deposit;
	return accountBalance;
    }


    public double processWithdrawal (double withdrawal) throws IOException
    {
	accountBalance = accountBalance - withdrawal;
	return accountBalance;
    }


    // ChequingAccount class

    public static void main (String[] args) throws IOException
    {
	BufferedReader in = new BufferedReader (new InputStreamReader (System.in));
	System.out.println ("Your Chequing Account");
	System.out.println ("---------------------");
	System.out.println ();
	System.out.print ("What is your balance? ");
	double balance = Double.valueOf (in.readLine ()).doubleValue ();
	//Create object of ChequingAccount Class and send user balance
	//*************************************************************
	ChequingAccount ca = new ChequingAccount (balance); //ca object created
	System.out.println ("SELECT FROM THE FOLLOWING OPTIONS--1, 2, or 3: ");
	System.out.println ("1. Make a deposit");
	System.out.println ("2. Make a withdrawal");
	System.out.println ("3. Quit");
	System.out.println ();
	String choice = in.readLine ();
	while (!choice.equals ("3"))
	{
	    if (choice.equals ("1")) //Make a deposit
	    {
		System.out.print ("Enter deposit amount: ");
		double deposit = Double.valueOf (in.readLine ()).doubleValue ();
		System.out.println ("Your new balance is: " + ca.processDeposit (deposit));
	    }


	    else if (choice.equals ("2")) //Make a withdrawal
	    {
		System.out.print ("Enter withdrawal amount: ");
		double withdrawal = Double.valueOf (in.readLine ()).doubleValue ();
		System.out.println ("New balance is: " + ca.processWithdrawal (withdrawal));
	    }


	    System.out.println ("SELECT FROM THE FOLLOWING OPTIONS--1, 2, or 3: ");
	    System.out.println ("1. Make a deposit");
	    System.out.println ("2. Make a withdrawal");
	    System.out.println ("3. Quit");
	    System.out.println ();
	    choice = in.readLine ();
	}
    }
}

