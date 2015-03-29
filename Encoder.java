// The "Encoder" class.

import java.io.*;

public class Encoder
{
    public static void main (String[] args) throws IOException
    {
	String line;
	String a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x; //All the variables declared
	BufferedReader in;
	in = new BufferedReader (new FileReader ("FileIn.txt")); //Reads the file called FileIn.txt
	line = in.readLine ();
	System.out.println ("The Message: " + line);
	a = line.substring (0);
	b = line.substring (1);
	c = line.substring (2);
	d = line.substring (3);
	e = line.substring (4); //These label the letters and numbers to be used to rearrange them
	f = line.substring (5);
	g = line.substring (6);
	h = line.substring (7);
	i = line.substring (8);
	j = line.substring (9);
	k = line.substring (10);
	l = line.substring (11);
	m = line.substring (12);
	n = line.substring (13);
	o = line.substring (14);
	p = line.substring (15);
	q = line.substring (16);
	r = line.substring (17);
	s = line.substring (18);
	t = line.substring (19);
	u = line.substring (20);
	v = line.substring (21);
	w = line.substring (22);
	x = line.substring (23);

	PrintWriter out; //tells the prgoram to create a file
	out = new PrintWriter (new FileWriter ("FileOut.txt"));//This names the file that its going to create: FileOut.txt
	out.print (x + w + v + u + t + s + r + q + p + o + n + m + l + k + j + i + h + g + f + e + d + c + b + a); //rearranges the message
	System.out.println ("Becomes: " + x + w + v + u + t + s + r + q + p + o + n + m + l + k + j + i + h + g + f + e + d + c + b + a); //shows what the message will be
	System.out.println ("Compiled, you can close now.");//Tells you its ok to close the program now
    }
}

