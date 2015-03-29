import java.awt.*;
import java.awt.event.*;
import javax.swing.*;//These are the imports from the library that are needed
import java.io.*;

public class Mike_menu extends JFrame implements ActionListener
{


    Container contentPane;



    //This is the constructor, when an object is created, this method is called.

    //This method creates the menu bar.
    public Mike_menu ()
    {
	JMenuBar menuBar;
	JMenu menu;
	JMenuItem menuItem;

	menuBar = new JMenuBar ();
	setJMenuBar (menuBar);

	menu = new JMenu ("File");
	menuBar.add (menu);

	menuItem = new JMenuItem ("Open");
	menuItem.addActionListener (this);
	menu.add (menuItem);

	menuItem = new JMenuItem ("Close");
	menuItem.addActionListener (this);
	menu.add (menuItem);

	menuItem = new JMenuItem ("Quit");
	menuItem.addActionListener (this);
	menu.add (menuItem);


	menu = new JMenu ("Edit");
	menuBar.add (menu);

	menuItem = new JMenuItem ("Undo");
	menuItem.addActionListener (this);
	menu.add (menuItem);

	menuItem = new JMenuItem ("Copy");
	menuItem.addActionListener (this);
	menu.add (menuItem);

	menuItem = new JMenuItem ("Paste");
	menuItem.addActionListener (this);
	menu.add (menuItem);

	menuItem = new JMenuItem ("Find");
	menuItem.addActionListener (this);
	menu.add (menuItem);

	menu = new JMenu ("Insert");
	menuBar.add (menu);

	menuItem = new JMenuItem ("Image");
	menuItem.addActionListener (this);
	menu.add (menuItem);

	menu = new JMenu ("Tools");
	menuBar.add (menu);

	menuItem = new JMenuItem ("Spelling");
	menuItem.addActionListener (this);
	menu.add (menuItem);//These are are the menu heading and selection

	menuItem = new JMenuItem ("Word Count");
	menuItem.addActionListener (this);
	menu.add (menuItem);
	
	menu = new JMenu ("Help");
	menuBar.add (menu);
	
	menuItem = new JMenuItem ("About");
	menuItem.addActionListener (this);
	menu.add (menuItem);
	
	menuItem = new JMenuItem ("Help");
	menuItem.addActionListener (this);
	menu.add (menuItem);

    }



    //the menu items all call this function

    public void actionPerformed (ActionEvent e)
    {
	String event = e.getActionCommand ();
	//Menu Items
	if (event.equals ("Quit"))//The only fucntion is quit right now
	{
	    System.exit (0);
	}

    }


    public static void main (String[] args) throws IOException
    {

	//Create new object of type 'building_a_gui_part1' hmm
	//That class name is awfully long, someone should shorten it.

	Mike_menu window = new Mike_menu ();

	//Give window a title
	window.setTitle ("Mikes First Menu");//This creates the title

	//Give it an initial size
	window.setSize (850, 650);

	//Show it
	window.setVisible (true);


    }





}


