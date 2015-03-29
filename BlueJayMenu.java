import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class BlueJayMenu extends JFrame implements ActionListener
{

	JTable table;
int row,column;


	Container contentPane;
	JPanel playerPane;
	JLabel L1, L2;
	JTextField playerNameField, playerPositionField;
	JButton addPlayerButton;


	int Players = 0;
	String[][] playerData = new String[100][2];

	public void addAPlayer()
	{

		playerData[Players][0] = playerNameField.getText();
		playerData[Players][1] = playerPositionField.getText();
		Players = Players + 1;

		playerNameField.setText("");
		playerPositionField.setText("");

	}

	public void displayAll()
	{
		JButton Button;
		JPanel bottomPane;

		bottomPane = new JPanel ();
		bottomPane.setLayout (new BorderLayout ());


		contentPane = getContentPane();

		if(playerPane !=null)
			contentPane.remove(playerPane);

		playerPane = new JPanel();
		playerPane.setLayout(new BorderLayout());


		L1 = new JLabel("Toronto Blue Jay Draft Choices", JLabel.CENTER);
		L1.setFont(new Font ("Arial", Font.BOLD, 24));
		playerPane.add(L1, BorderLayout.NORTH);

		L2 = new JLabel("End of Page", JLabel.CENTER);
		playerPane.add (L2, BorderLayout.SOUTH);

		Button = new JButton ("Delete Player");
		Button.addActionListener (this);
		bottomPane.add (Button, BorderLayout.EAST);
		Button = new JButton ("Modify Player");
		Button.addActionListener (this);
		bottomPane.add (Button, BorderLayout.WEST);


		playerPane.add(bottomPane, BorderLayout.SOUTH);

		String[] columnNames = {"Name", "Position"};
		table = new JTable (playerData, columnNames);

		table.addMouseListener (new MouseAdapter ()
		{
		    public void mouseClicked (MouseEvent e)
		    {
				row = table.getSelectedRow ();
				column = table.getSelectedColumn ();
		   		System.out.println(row+"  "+column);
		   }
		}
		);

		JScrollPane scrollPane = new JScrollPane(table);
		playerPane.add(scrollPane, BorderLayout.CENTER);


		contentPane.add(playerPane);

		validate();
	}








	public BlueJayMenu()
	{
		JMenuBar menuBar;
		JMenu menu;
		JMenuItem menuItem;

		menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		menu = new JMenu("File");
		menuBar.add(menu);

		menuItem = new JMenuItem("Quit");
		menuItem.addActionListener(this);
		menu.add(menuItem);

		menuItem = new JMenuItem("Save");
		menuItem.addActionListener(this);
		menu.add(menuItem);

		menuItem = new JMenuItem("Load");
		menuItem.addActionListener(this);
		menu.add(menuItem);

		menu = new JMenu("Player Menu");
		menuBar.add(menu);

		menuItem = new JMenuItem("Add a Player");
		menuItem.addActionListener(this);
		menu.add(menuItem);

		menu = new JMenu("Display Menu");
		menuBar.add(menu);

		menuItem = new JMenuItem("Display all Players");
		menuItem.addActionListener(this);
		menu.add(menuItem);



	}

	public void addPlay()
	{

		contentPane = getContentPane();

		if(playerPane !=null)
			contentPane.remove(playerPane);

		playerPane = new JPanel();


		L1 = new JLabel ("Add player name: ");
		L2 = new JLabel ("Add player position: ");

		playerPane.add(L1);
		playerNameField = new JTextField(20);
		playerPane.add(playerNameField);

		playerPane.add(L2);
		playerPositionField = new JTextField(20);
		playerPane.add(playerPositionField);

		//Add the add button to show get text
		addPlayerButton = new JButton("Add Player");
		addPlayerButton.addActionListener(this);
		playerPane.add(addPlayerButton);


		//display the player pane
		contentPane.add(playerPane);
		validate();
	}



	public void delPlay()
	{
		int x;
		for (x = row ; x < Players ; x++)
		{
		   	playerData [x] [0] = playerData [x + 1] [0];
		   	playerData [x] [1] = playerData [x + 1] [1];
		}

		playerData [Players] [0] = "";
		playerData [Players] [1] = "";
		Players = Players - 1;
		displayAll();
	}






	public void actionPerformed(ActionEvent e)
	{
		String event = e.getActionCommand();

		//Menu Items
		if(event.equals("Load"))
		{
			try
			{
				load();
			}
			catch(IOException ioerror)
			{
				System.out.println("Input/Output error - program crashed "+ioerror);
			}

		}
		else if(event.equals("Save"))
		{
			try
			{
				save();
			}
			catch(IOException ioerror)
			{
				System.out.println("Input/Output error - program crashed"+ioerror);
			}
		}
		if(event.equals("Quit"))
		{
			hide();
			System.exit(0);
		}
		else if(event.equals("Add a Player"))
		{
			addPlay();
		}
		else if(event.equals("Delete Player"))
		{
			System.out.println("Deleting");
			delPlay();
		}
		else if(event.equals("Modify Player"))
		{
			displayAll();
		}

		else if(event.equals("Display all Players"))
		{
			displayAll();
		}

		else if(event.equals("Add Player"))
		{
			addAPlayer();
		}



	}

	public  void load() throws IOException
	{
		BufferedReader in;
		int x;

		in = new BufferedReader(new FileReader("players.txt"));
		Players = Integer.valueOf(in.readLine()).intValue();
		for(x = 0; x < Players; x++)
		{
			playerData[x][0] = in.readLine();
			playerData[x][1] = in.readLine();
		}
		in.close();

		JOptionPane.showMessageDialog(playerPane, Players+" Records Successfully Loaded");

	}



	public  void save() throws IOException
	{
		PrintWriter fileout;
		int x;
		fileout = new PrintWriter(new FileWriter("players.txt"));
		fileout.println(Players);
		for (x = 0; x < Players;x++)
		{
			fileout.println(playerData[x][0]);
			fileout.println(playerData[x][1]);
		}
		fileout.close();
		JOptionPane.showMessageDialog(playerPane, Players+" Records Successfully Saved");
	}


	public static void main(String[] args) throws IOException
	{
		BlueJayMenu window = new BlueJayMenu();
		window.setTitle("Toronto Blue Jays Draft Choices");
		window.setSize(800,600);
		window.setVisible(true);
	}


}

