package onlineexamination;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Exception;
import java.util.Timer;
import java.util.TimerTask;
public class Login  extends JFrame implements ActionListener
{
	JButton b1;
	JPanel newPanel,newPanel2;
	JLabel userLabel, passLabel;
	final JTextField  textField1, textField2;
	Login()
	{
		JLabel userLabel = new JLabel("                        Username");
		userLabel.setFont(new Font("Arial", Font.PLAIN, 40));   //"<b><font face=\"Verdana\" size=\"30\"> This is a demo text with a different font!</font></b>"
		textField1 = new JTextField(15);
		Font bigFont1 = textField1.getFont().deriveFont(Font.PLAIN, 40f);
		textField1.setFont(bigFont1);
		JLabel passLabel = new JLabel("                        Password");
		passLabel.setFont(new Font("Arial", Font.PLAIN, 40));
		textField2 = new JPasswordField(8);
		Font bigFont2 = textField2.getFont().deriveFont(Font.PLAIN, 40f);
		textField2.setFont(bigFont2);
		b1 = new JButton("SUBMIT");
		b1.setFont(new Font("Arial", Font.PLAIN, 40));
		newPanel = new JPanel(new GridLayout(2,2,20,50));
		newPanel.add(userLabel);
		newPanel.add(textField1);
		newPanel.add(passLabel);
		newPanel.add(textField2);
		newPanel2= new JPanel(new FlowLayout());
		newPanel2.add(b1);
		add(newPanel, BorderLayout.CENTER);
		add("South",newPanel2);
		b1.addActionListener(this);
		setTitle("ONLINE EXAMINATION LOGIN FORM");
	}
	public void actionPerformed(ActionEvent ae)
	{
		String userValue = textField1.getText();
		String passValue = textField2.getText();
		if(!passValue.equals(""))
			new OnlineTestBegin(userValue);
		else
		{
			textField2.setText("Enter Password : ");
			actionPerformed(ae);
		}
	}
}



