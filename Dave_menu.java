import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class building_a_gui_part1 extends JFrame implements ActionListener
{


	Container contentPane;



	//This is the constructor, when an object is created, this method is called.

	//This method creates the menu bar.
	public building_a_gui_part1()
	{
		JMenuBar menuBar;
		JMenu menu;
		JMenuItem menuItem;

		menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		menu = new JMenu("File");
		menuBar.add(menu);

		menuItem = new JMenuItem("file menu item 1");
		menuItem.addActionListener(this);
		menu.add(menuItem);

		menuItem = new JMenuItem("file menu item 2");
		menuItem.addActionListener(this);
		menu.add(menuItem);

		menuItem = new JMenuItem("Quit");
		menuItem.addActionListener(this);
		menu.add(menuItem);


		menu = new JMenu("Another Menu");
		menuBar.add(menu);

		menuItem = new JMenuItem("Menu Item");
		menuItem.addActionListener(this);
		menu.add(menuItem);

		menu = new JMenu("Another Menu");
		menuBar.add(menu);

		menuItem = new JMenuItem("Item");
		menuItem.addActionListener(this);
		menu.add(menuItem);



	}



	//the menu items all call this function

	public void actionPerformed(ActionEvent e)
	{
		String event = e.getActionCommand();
		//Menu Items
		if(event.equals("Quit"))
		{
			System.exit(0);
		}
		else if(event.equals("Item"))
		{
			System.out.println("You chose Item");
		}

	}



	public static void main(String[] args) throws IOException
	{

		//Create new object of type 'building_a_gui_part1' hmm
		//That class name is awfully long, someone should shorten it.

		building_a_gui_part1 window = new building_a_gui_part1();

		//Give window a title
		window.setTitle("Building a Gui Part 1");

		//Give it an initial size
		window.setSize(800,600);

		//Show it
		window.setVisible(true);


	}





}


