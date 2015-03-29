import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class GuI extends JFrame implements ActionListener
{

	//These are the class variables
	//This is the string to hold the name of the image
	//We will call it banana.gif but you may want to change this
	//to an image that is in the same directory as your program

	static String imageFile = "banana.gif";

	//contentPane will be the main object of your GUI,
	//Using our analogy this is like the door to the fridge
	Container contentPane;


	//Image panel is like the magnet we throw on the door

	ImagePanel imagePanel;


	//loadPanel is a different magner

	JPanel loadPanel;

	//Here are a few more graphic objects we will use.

	JLabel L1;
	JTextField fileNameField;
	JButton addButton;




	//imageDisplay is a class, this method is
	//the constructor of the class, this means when
	//an object is declared, the first method to be called
	//will be this method.
	public imageDisplay()
	{

		//The basic purpose of this method is to

		//Create the menu bar at the top of the window
		//So take notice how we creare a menuBar
		//Then we create a menu
		//Then we create Menu Items and add them all together!
		JMenuBar menuBar;
		JMenu menu;
		JMenuItem menuItem;

		menuBar = new JMenuBar();

		//This sets the menuBar in place
		setJMenuBar(menuBar);

		menu = new JMenu("File");
		menuBar.add(menu);


		menuItem = new JMenuItem("Load Image");
		menuItem.addActionListener(this);
		menu.add(menuItem);

		menuItem = new JMenuItem("Quit");
		menuItem.addActionListener(this);
		menu.add(menuItem);


		menu = new JMenu("Display");
		menuBar.add(menu);

		menuItem = new JMenuItem("Display Image");
		menuItem.addActionListener(this);
		menu.add(menuItem);



	}


	//This method, not to be confused with imageDisplay
	//will actually load the image onto the screen.
	//It is called when the user chooses the menu item display Image
	public void displayImage()
	{


		//This basically finds the original content pane, or..the front of the fridge

		contentPane = getContentPane();
		//Create the image


		//Just some error handeling
		if(loadPanel !=null)
			contentPane.remove(loadPanel);


		//Create an image
		Image image = Toolkit.getDefaultToolkit().getImage(this.imageFile);

		//Create the image panel
		imagePanel = new ImagePanel(image);

		//Add the image panel
		contentPane.add(imagePanel, BorderLayout.CENTER);

		//Validate is like a screen refresh!
		validate();
	}


	//This method is called when the user selects load image
	public void load()
	{

		//Find the front of the fridge
		contentPane = getContentPane();


		//Error checking
		if(imagePanel != null)
			contentPane.remove(imagePanel);


		//Create a new panel
		loadPanel = new JPanel();

		L1 = new JLabel ("File Name:");

		loadPanel.add(L1);
		fileNameField = new JTextField(20);
		loadPanel.add(fileNameField);

		//Add the add button to show get text
		addButton = new JButton("Load File");
		addButton.addActionListener(this);
		loadPanel.add(addButton);

		//display the player pane
		contentPane.add(loadPanel);
		validate();
	}




	//Like previous menus, this method recives an
	//Action Event, which for your purposes is comparable to a string.
	//We then have a series of if statements to deciede what menu choice
	//the user has selected.
	public void actionPerformed(ActionEvent e)
	{
		String event = e.getActionCommand();

		//Menu Items
		if(event.equals("Display Image"))
		{
				displayImage();

		}
		else if(event.equals("Load Image"))
		{
			load();
		}
		else if(event.equals("Load File"))
		{
			imageFile = fileNameField.getText();
		}





	}



	//This is the first method that is called!
	public static void main(String[] args) throws IOException
	{


		//Create an object of type imageDisplay
		imageDisplay window = new imageDisplay();

		//Set the text at the top of the window
		window.setTitle("Image Displayer");


		//Set the intitial size, and make it visible
		window.setSize(800,600);
		window.setVisible(true);


	}





}





//This is a seperate class this is what our image is displayed on
class ImagePanel extends JPanel {

    //Image variable
    Image image;

    //Create the panel. In java terms this method is known as a constructor
    public ImagePanel(Image image) {

	//set the image
	this.image = image;
    }

    //This draws the image on the panel...kind of complicated

    public void paintComponent(Graphics g) {
	super.paintComponent(g); //paint background
	//Draw image at its natural size first.
	g.drawImage(image, 0, 0, this); //85x62 image
    }
}



