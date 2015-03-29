// The "Decoder" class.

import java.io.*;

public class Decoder
{
    public static void main (String[] args) throws IOException
     {
	String line;
	String a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x;//Declares all variabled needed
	BufferedReader in;
	in = new BufferedReader (new FileReader ("FileOut.txt"));//Reads the file that we just created
	line = in.readLine ();//Reads the file text
	System.out.println("The Message: " +line);// shows the beginning message
	a = line.substring (0);
	b = line.substring (1);//These label all the 23 letters or numbers
	c = line.substring (2);
	d = line.substring (3);
	e = line.substring (4);
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

	PrintWriter out;//This tells to create a new file
	out = new PrintWriter (new FileWriter ("FileIn2.txt")); //Calling the file FileIn2.txt
	out.print (x + w + v + u + t + s + r + q + p + o + n + m + l + k + j + i + h + g + f + e + d + c + b + a); //Rearranges the text to right order
	System.out.println("Becomes: " +x + w + v + u + t + s + r + q + p + o + n + m + l + k + j + i + h + g + f + e + d + c + b + a);//Shows what will be in the file.
	System.out.println("Encoded, you can close now.");//Friendly message

    } 
} 
