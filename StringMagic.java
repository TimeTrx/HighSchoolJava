class StringMagic
{
	public static void main (String[] args) 
	{
		String name:
		Tricks1 in:
		Tricks2 in:
		Word1  = new Tricks1(new InputStreamReader(System.in));
		W = Word1.length(); //First word counter command
		System.out.println("Word 1 Characters: "+W); /*This will output the # of characters in the first word.*/
		Tea = Word1.charat(5); //Counter for the 6th character
		System.out.println("Word 1 6th Letter: "+Tea); /*This will output the 6th letter in the first word.*/
		Word2  = new Tricks2(new InputStreamReader(System.in));
		X = Word2.length(); //Second word counter command
		System.out.println("Word 2 Characters: "+W); /*This will output the # of characters in the second word.*/
		Tyler = Word1.charat(5); //Counter for the 6th character
		System.out.println("Word 1 6th Letter: "+W); /*This will output the 6th letter in the first word.*/
		cma= Word1.compareToIgnoreCase (Word2); /*This is the comparison counter*/
		System.out.println("Comparing: "+cma); /*This will output the comparison of the amount letters in the two words entered.*/
	}
}

