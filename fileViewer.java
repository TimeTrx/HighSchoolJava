//Import Libraries
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;


/**********************************
*
* Class: fileViewer
* Purpose: an Instance of fileViewer will create a GUI
*          that can be used for opening a file, editing a file, and saving a file
*
*/
public class fileViewer extends JFrame implements ActionListener
{


    //contentPane is the main container for the fileViewer.
    Container contentPane;

    //fileName is a variable used for holding file name input from the user

    String fileName = "";


    //A couple text fields to get the name of the file when opening and saving
    JTextField input;
    JTextField output;

    //page will be the area where the text appears
    JTextArea page;


    //This nifty object allows scrolling when there is too much text for page

    JScrollPane scrollpane;

    //remember: JFrame - > Container -> ***JPanel*** -> objects
    JPanel mainPanel;

    //This JFrame is used for pop up windows
    JFrame openWin;


    /*********************************

    * Method: openFile
    * Purpose: This method is called after the user
    *          has inputted a file to open and clicked the open file button
    *          It then reads in the file and outputs the information to 'page'
    *
    */
    public void openFile () throws IOException
    {


	//Get the current content pane
	contentPane = this.getContentPane ();

	//refresh the content pane
	if (mainPanel != null)
	    contentPane.remove (mainPanel);

	//Create a new mainPanel
	mainPanel = new JPanel ();


	//We need a buffered reader to read the file
	BufferedReader in = new BufferedReader (new FileReader (fileName));

	//Temp will hold heach line read in, text will be the final string
	String temp = "";
	String text = "";

	//read the first line
	temp = in.readLine ();

	//loop until the file has ended
	while (temp != null)
	{

	    //add temp to text, to create the final string line by line
	    text = text + temp + '\n';

	    //read another line
	    temp = in.readLine ();
	}

	//create the text area.
	//send it (String data, height, width)

	page = new JTextArea (text, 30, 50);
	//Set line wrap to true, other wise it would just be one looooong line
	page.setLineWrap (true);

	//Here is where we create our scroll pane.
	scrollpane = new JScrollPane (page);


	//the page is connected to the scrollpane, the scrollpane gets connected to the mainPanel
	mainPanel.add (scrollpane);

	//The mainPanel is connected to the contentPane
	contentPane.add (mainPanel);

	//refresh the JFrame!
	validate ();

    }


    /********************************
    * method: open
    * purpose: This method is called when the user selects open
    *          from the file menu, it will create a new JFrame, which
    *          has its own container and panel, and will ask the user for
    *          a file to open, if the user gives a file name and clicks open
    *          then openFile() will be called.
    */
    public void open () throws IOException
    {

	//Create a new window to pop up
	openWin = new JFrame ("Open new file");

	//Get the JFrames content pane
	Container openFile = openWin.getContentPane ();

	//Create labels and buttons to ask for file name
	JLabel L1;
	JPanel panel = new JPanel ();
	JButton openButton;

	//Give the label some text
	L1 = new JLabel ("File Name: ");

	//The label is connected to the panel
	panel.add (L1);

	input = new JTextField (20);
	//The text field is connected to the panel
	panel.add (input);

	//Add the add button to show get text
	openButton = new JButton ("Open File");
	openButton.addActionListener (this);

	//the button is connected to the panel
	panel.add (openButton);

	//The panel is connected to the container
	openFile.add (panel);

	//Set the size and make it visible
	openWin.setBounds (50, 100, 400, 150);
	openWin.setVisible (true);
    }


    /*******************************

    * Method: saveFile
    * Purpose: When the user has entered a filename and clicked save
    *          thes method is called and it will create a PrintWriter and output
    *          the text currently in the page.
    *
    *
    */
    public void saveFile () throws IOException
    {
	//Create a printwriter
	PrintWriter out = new PrintWriter (new FileWriter (fileName));

	//page.getText is all the text currently in the JTextArea
	out.println (page.getText ());

	//close the file
	out.close ();
    }


    /*******************************

    * Method: save
    * Purpose: When the user selects file->save, this method is called
    *          this method will create a new window prompting the user to enter
    *                  a name for saving the file.
    *
    */
    public void save () throws IOException
    {
	//Create a new window to pop up
	openWin = new JFrame ("Save File");

	//Get the JFrames content pane
	Container saveFile = openWin.getContentPane ();

	//Create labels and buttons to ask for file name
	JLabel L1;
	JPanel panel = new JPanel ();
	JButton saveButton;

	L1 = new JLabel ("Save As: ");

	panel.add (L1);
	output = new JTextField (20);
	panel.add (output);

	//Add the add button to show get text
	saveButton = new JButton ("Save File");
	saveButton.addActionListener (this);
	panel.add (saveButton);

	//display the player pane
	saveFile.add (panel);

	openWin.setBounds (50, 100, 400, 150);
	openWin.setVisible (true);
    }


    /*******************************************
    * Method: fileViewer (Constructor)
    * Purpose: This constructor will create the menu bar at the top of the JFrame.
    *          It will also  add a blank text area for the user to type in.
    *
    */
    public fileViewer ()
    {

	//Set up the menu
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

	menuItem = new JMenuItem ("Save");
	menuItem.addActionListener (this);
	menu.add (menuItem);


	menuItem = new JMenuItem ("Quit");
	menuItem.addActionListener (this);
	menu.add (menuItem);

	menu = new JMenu ("Credits");
	menuBar.add (menu);

	menuItem = new JMenuItem ("Credits");
	menuItem.addActionListener (this);
	menu.add (menuItem);

	//Set up the blank text area

	//Get the current content pane
	contentPane = this.getContentPane ();
	//Create a new mainPanel
	mainPanel = new JPanel ();

	page = new JTextArea (30, 50);
	//Set line wrap to true, other wise it would just be one looooong line
	page.setLineWrap (true);

	//Here is where we create our scroll pane.
	scrollpane = new JScrollPane (page);

	//the page is connected to the scrollpane, the scrollpane gets connected to the mainPanel
	mainPanel.add (scrollpane);

	//The mainPanel is connected to the contentPane
	contentPane.add (mainPanel);

	//refresh the JFrame!
	validate ();

    }



    /**************************************************
    * Method: actionPerformed
    * Purpose: When buttons or menu items are clicked, this method handles them and
    *            calls the correct functions.
    *
    *
    */
    public void actionPerformed (ActionEvent e)
    {
	String event = e.getActionCommand ();
	//Menu Items
	if (event.equals ("Quit"))
	{
	    System.exit (0);
	}
	else if (event.equals ("Item"))
	{
	    System.out.println ("You chose Item");
	}

	else if (event.equals ("Open"))
	{
	    try
	    {
		open ();
	    }
	    catch (IOException error)
	    {
		System.out.println (error);
	    }

	}
	else if (event.equals ("Open File"))
	{
	    fileName = input.getText ();
	    openWin.dispose ();
	    try
	    {
		openFile ();
	    }
	    catch (IOException error)
	    {
		System.out.println (error);
	    }
	}
	else if (event.equals ("Save"))
	{
	    try
	    {
		save ();
	    }
	    catch (IOException error)
	    {
		System.out.println (error);
	    }
	}
	else if (event.equals ("Save File"))
	{
	    fileName = output.getText ();
	    openWin.dispose ();
	    try
	    {
		saveFile ();
	    }
	    catch (IOException error)
	    {
		System.out.println (error);
	    }
	}
	else if (event.equals ("Credits"))
	{
	    System.out.println ("File Viewer Version XXX.0006");
	    System.out.println ("Created By: JOHNNY UNKNOWN");
	    System.out.println ("SPELLED CHECKED BY: Hope Kansas");
	    System.out.println ("Credits By: MIKE MORAND");
	    System.out.println ("Finished: AUGUST 30, 2011");
	    System.out.println ("DEBUGGED BY: Jack Morrison");
	    System.out.println ("Original Idea By: Patty Johnson");
	    System.out.println ("Funding Provided By: Gastone Belaudre");
	    System.out.println ();
	    System.out.println ();
	    System.out.println ();
	    System.out.println ();
	    System.out.println ("ENJOY!!!");
	    System.out.println ("¦¦¦¦¦¦¦¦¦¦¦¦");
	    System.out.println ("¦¦¦¦#¦¦#¦¦¦¦");
	    System.out.println ("¦¦¦¦#¦¦#¦¦¦¦");
	    System.out.println ("¦¦¦¦¦¦¦¦¦¦¦¦");
	    System.out.println ("¦#¦¦¦¦¦¦¦¦#¦");
	    System.out.println ("¦¦########¦¦");
	    System.out.println ("¦¦¦¦¦¦¦¦¦¦¦¦");
	    System.out.println ();
	    System.out.println ();
	    System.out.println ("Copyright JAVA-SUN SYSTEM LLC");



	    //Original design from: http://text-symbols.com/art/ modified to work in the program


	}



    }




    /*************************************
    * Method: main()
    * Purpose: Called when the program is first run
    *          Will create a new fileViewer object called window
    *          will then give window a title, size and make it visible.
    *
    *
    *
    */
    public static void main (String[] args) throws IOException
    {


	fileViewer window = new fileViewer ();

	//Give window a title
	window.setTitle ("Loading and Saving a File");

	//Give it an initial size
	window.setSize (800, 600);

	//Show it
	window.setVisible (true);


    }





}
