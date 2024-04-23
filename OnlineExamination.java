package onlineexamination;

import javax.swing.JOptionPane;

public class OnlineExamination {

	public static void main(String args[])
	{
		try
		{
			Login form = new Login();
			form.setSize(1500,800);
			form.setVisible(true);
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
}
