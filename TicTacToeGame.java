import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class TicTacToeGame implements ActionListener
{
	private JButton button1, button2, button3, button4, button5, button6, button7, button8, button9;
	private String str;
	private int count = 0;
	private Color color;
	private boolean flag = false;
	private JFrame frame;
	private static String person1;
	private static String person2;
	private static String winName;
	
	TicTacToeGame()
	{
		frame = new JFrame("Tic Tac Toe Game");
		frame.setSize(600,500);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		frame.setLayout(new GridLayout(3,3));
		
		button1 = new JButton();
		button1.addActionListener(this);
		frame.add(button1);
		
		button2 = new JButton();
		button2.addActionListener(this);
		frame.add(button2);
		
		button3 = new JButton();
		button3.addActionListener(this);
		frame.add(button3);
		
		button4 = new JButton();
		button4.addActionListener(this);
		frame.add(button4);
		
		button5 = new JButton();
		button5.addActionListener(this);
		frame.add(button5);
		
		button6 = new JButton();
		button6.addActionListener(this);
		frame.add(button6);
		
		button7 = new JButton();
		button7.addActionListener(this);
		frame.add(button7);
		
		button8 = new JButton();
		button8.addActionListener(this);
		frame.add(button8);
		
		button9 = new JButton();
		button9.addActionListener(this);
		frame.add(button9);
		
		frame.setVisible(true);
	}
	
	//@override
	public void actionPerformed(ActionEvent event)
	{
		count = count+1;
		if(count%2 == 0)
		{
			str = "X";
			winName = person2;
			color = Color.CYAN;
		}
		else
		{
			str = "0";
			winName = person1;
			color = Color.YELLOW;
		}
		
		Font font = new Font("SendSerrif", Font.BOLD, 60);
		
		if(event.getSource() == button1)
		{
			button1.setText(str);
			button1.setBackground(color);
			button1.setFont(font);
			button1.setEnabled(false);
		}
		if(event.getSource() == button2)
		{
			button2.setText(str);
			button2.setBackground(color);
			button2.setFont(font);
			button2.setEnabled(false);
		}
		if(event.getSource() == button3)
		{
			button3.setText(str);
			button3.setBackground(color);
			button3.setFont(font);
			button3.setEnabled(false);
		}
		if(event.getSource() == button4)
		{
			button4.setText(str);
			button4.setBackground(color);
			button4.setFont(font);
			button4.setEnabled(false);
		}
		if(event.getSource() == button5)
		{
			button5.setText(str);
			button5.setBackground(color);
			button5.setFont(font);
			button5.setEnabled(false);
		}
		if(event.getSource() == button6)
		{
			button6.setText(str);
			button6.setBackground(color);
			button6.setFont(font);
			button6.setEnabled(false);
		}
		if(event.getSource() == button7)
		{
			button7.setText(str);
			button7.setBackground(color);
			button7.setFont(font);
			button7.setEnabled(false);
		}
		if(event.getSource() == button8)
		{
			button8.setText(str);
			button8.setBackground(color);
			button8.setFont(font);
			button8.setEnabled(false);
		}
		if(event.getSource() == button9)
		{
			button9.setText(str);
			button9.setBackground(color);
			button9.setFont(font);
			button9.setEnabled(false);
		}
		
		winPosibilities();
		winPerson();
	}
	
	void winPosibilities()
	{
		// for row
		
		if(button1.getText() == button2.getText() && button2.getText() == button3.getText() && button3.getText() != "")
		{
			flag = true;
		}
		else if(button4.getText() == button5.getText() && button5.getText() == button6.getText() && button6.getText() != "")
		{
			flag = true;
		}
		else if(button7.getText() == button8.getText() && button8.getText() == button9.getText() && button9.getText() != "")
		{
			flag = true;
		}
		// for column
		else if(button1.getText() == button4.getText() && button4.getText() == button7.getText() && button7.getText() != "")
		{
			flag = true;
		}
		else if(button2.getText() == button5.getText() && button5.getText() == button8.getText() && button8.getText() != "")
		{
			flag = true;
		}
		else if(button3.getText() == button6.getText() && button6.getText() == button9.getText() && button9.getText() != "")
		{
			flag = true;
		}
		// for diagonal
		else if(button1.getText() == button5.getText() && button5.getText() == button9.getText() && button9.getText() != "")
		{
			flag = true;
		}
		else if(button3.getText() == button5.getText() && button5.getText() == button7.getText() && button7.getText() != "")
		{
			flag = true;
		}
		else
		{
			flag = false;
		}
	}
	
	// find win name.
	void winPerson()
	{
		if(flag == true)
		{
			JOptionPane.showMessageDialog(frame, winName+ " Win");
			reStart();
		}
		else if(flag == false && count == 9)
		{
			JOptionPane.showMessageDialog(frame, "Match Draw");
			reStart();
		}
	}
	
	//  start game again
	void reStart()
	{
		int num = JOptionPane.showConfirmDialog(frame, "Do you want play game again");
		
		if(num == 0)
		{
			str = "";
			count = 0;
			color = null;
			flag = false;
			
			button1.setText("");
			button1.setBackground(color);
			button1.setEnabled(true);
			
			button2.setText("");
			button2.setBackground(color);
			button2.setEnabled(true);
			
			button3.setText("");
			button3.setBackground(color);
			button3.setEnabled(true);
			
			button4.setText("");
			button4.setBackground(color);
			button4.setEnabled(true);
			
			button5.setText("");
			button5.setBackground(color);
			button5.setEnabled(true);
			
			button6.setText("");
			button6.setBackground(color);
			button6.setEnabled(true);
			
			button7.setText("");
			button7.setBackground(color);
			button7.setEnabled(true);
			
			button8.setText("");
			button8.setBackground(color);
			button8.setEnabled(true);
			
			button9.setText("");
			button9.setBackground(color);
			button9.setEnabled(true);
		}
		else if(num == 1)
		{
			System.exit(0);
		}
		else if(num == 2)
		{
			button1.setEnabled(false);
			button2.setEnabled(false);
			button3.setEnabled(false);
			button4.setEnabled(false);
			button5.setEnabled(false);
			button6.setEnabled(false);
			button7.setEnabled(false);
			button8.setEnabled(false);
			button9.setEnabled(false);
		}
	}
	
	public static void personFind(String fName, String sName)
	{
		person1 = fName;
		person2 = sName;
	}
	
	public static void main(String[] args)
	{
		new StartGame();
		//new TicTacToeGame();
	}
}

//       Loging page
class StartGame
{
	private JLabel label1;
	private JLabel label2;
	private JTextField tf1;
	private JTextField tf2;
	private JButton button;
	private boolean flag = false;
	
	public StartGame() 
	{
		JFrame frame = new JFrame("Login Game");
		frame.setSize(600,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		
		label1 = new JLabel("First Person");
		label1.setBounds(100,100,100,30);
		frame.add(label1);
		
		tf1 = new JTextField();
		tf1.setBounds(200,100,300,30);
		frame.add(tf1);
		
		label2 = new JLabel("Second Person");
		label2.setBounds(100,180,100,30);
		frame.add(label2);
		
		tf2 = new JTextField();
		tf2.setBounds(200,180,300,30);
		frame.add(tf2);
				
		button = new JButton("Start Game");
		button.setBounds(250,400,100,40);
		frame.add(button);
		frame.getRootPane().setDefaultButton(button);
		frame.setVisible(true);
		
		button.addActionListener(event ->
		{
			if (!tf1.getText().isEmpty() && !tf2.getText().isEmpty()) // the place of isEmpty you can use the equals("")
			{
				String firstName = tf1.getText().toString();
				String secondName = tf2.getText().toString();
				
				TicTacToeGame.personFind(firstName, secondName);
				frame.setVisible(false);
				new TicTacToeGame();
			}
			else
			{
				JOptionPane.showMessageDialog(frame, "Pleae enter the first and second name");
			}
		});
		
	}
}