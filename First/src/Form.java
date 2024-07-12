import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Desktop;
import java.net.URI;
import java.net.URISyntaxException;
import java.io.IOException;
class Form extends JFrame implements ActionListener
{
	JLabel l1;
	JTextField t1;
	JButton b1;
	Form()
	{
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		l1=new JLabel("What is your streak with me !!");
		t1=new JTextField(10);
		b1=new JButton("Submit");
		
		c.add(l1);
		c.add(t1);
		c.add(b1);
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			try
			{
				Desktop streak = Desktop.getDesktop();
				streak.browse(new URI("file:///D:/Projects/Website/New/First/First.html"));
			}
			catch(IOException err) {}
			catch(URISyntaxException err) {}
		}
			
	}
	public static void main (String args[])
	{
		Form s = new Form();
		s.setVisible(true);
		s.setSize(600,400);
	}
}