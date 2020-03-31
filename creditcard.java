import javax.swing.*;

public class creditcard
	{public static void main (String[] args)
		{{JTextField ccnumber = new JTextField(15);
		JTextField expire = new JTextField(4);
		JTextField code = new JTextField(3);
		
		JPanel panel = new JPanel();
		{panel.add(new JLabel
			("<html>A-a-a dog just stole <br>" +
			"my lunch, p-p-please <br>" +
			"let me borrow your <br>" +
			"c-c-credit card so <br>" +
			"I c-c-can buy more <br>" +
			"melon bread.</html>"));}
		{panel.add(new JLabel("Credit Card number:"));}
		{panel.add(ccnumber);}
		{panel.add(new JLabel("Expiration Date:"));}
		{panel.add(expire);}
		{panel.add(new JLabel("Security Code:"));}
		{panel.add(code);}
		
		ImageIcon icon = new ImageIcon
			(creditcard.class.getResource("satania.png"));
		
		{JOptionPane.showMessageDialog(null, panel, "h-help", 0, icon);}}
		System.exit(0);}}

