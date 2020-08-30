import java.util.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.*;

public class Pass_Gen extends Frame implements ActionListener,WindowListener {
     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static TextField text = new TextField(20);
	
	public static void main(String args[]) throws Exception {
      Pass_Gen PASSWORD = new Pass_Gen("PASSWORD GENERATOR");
    		  PASSWORD.setSize(400,100);
    		  PASSWORD.setVisible(true);
 	}	
	public Pass_Gen(String txt)
	{
		 super(txt);
		 JFrame frame = new JFrame("Password generator");
		 JPanel panel = new JPanel();
		 panel.setLayout(new FlowLayout());
		 JLabel label = new JLabel(" ");
		 addWindowListener(this);
		 JButton button = new JButton();
		 button.setText("Generate password");
		 add(button);
		 add(text);
		 button.addActionListener(this);
		 panel.add(label);
		 panel.add(button);
		 frame.add(panel);
		 frame.setSize(400,100);
		 frame.setLocationRelativeTo(null);
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		 String Num_rand="1234567890";
	        String Cap_rand="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	        String Smal_rand="abcdefghijklmnopqrstuvwxyz";
	        String Val = Num_rand + Cap_rand + Smal_rand;
	        Random rand_gen= new Random();
	        char[] password = new char[10];
	        for(int i=0;i<10;i++)
	        {
	        	password[i] = Val.charAt(rand_gen.nextInt(Val.length()));
	        }
	        String Word = String.valueOf(password);
	        text.setText(Word);
	        try {
  			  FileWriter myPass = new FileWriter("*add path*");
  			  for(int j=0;j<Word.length();j++)
  			  {
  				 myPass.write(Word.charAt(j));
  			  }
  			  myPass.close();
  			  System.out.println("success");
  		  }
  		  catch (IOException E)
  		  {
  			  System.out.println("ERROR");
  		  }
	}
	public void windowOpened(WindowEvent e) {
		
	}
	public void windowClosing(WindowEvent e) {
		
	}
	public void windowClosed(WindowEvent e) {
		
	}
	public void windowIconified(WindowEvent e) {
		
	}
	public void windowDeiconified(WindowEvent e) {
		
	}
	public void windowActivated(WindowEvent e) {
		
	}
	public void windowDeactivated(WindowEvent e) {
		
	}
}
