package nag;

//import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.io.*;

public class gui {
	
	//public static Color black;
	
	public static void main(String []args) 
	{
		JFrame frame= new JFrame();
		
		frame.setSize(500,500);
		
		GridLayout g1= new GridLayout(5,5);
		
		frame.setLayout(g1);
		
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();	
		JPanel p4 = new JPanel();	
		JPanel p5 = new JPanel();	
		JPanel p6 = new JPanel();
		//JPanel p7 = new JPanel();
		//JPanel p8 = new JPanel();
		//JPanel p9 = new JPanel();
		//JPanel p10 = new JPanel();
		
		JLabel l1 =new JLabel("Name");
		JLabel l2 =new JLabel("ID");
		JLabel l3 =new JLabel("DOJ");
		JLabel l4 =new JLabel("DOB");
		
		JTextField t1= new JTextField();
		JTextField t2= new JTextField();
		JTextField t3= new JTextField();
		JTextField t4= new JTextField();
		
		t1.setPreferredSize(new Dimension(200,30));
		t2.setPreferredSize(new Dimension(200,30));
		t3.setPreferredSize(new Dimension(200,30));
		t4.setPreferredSize(new Dimension(200,30));
		
		JButton b1 = new JButton("SUBMIT");
		JButton b2 = new JButton("RESET");
		
		b1.addActionListener(new ActionListener()
				{
					//@Override
					public void actionPerformed(ActionEvent e)
					{
						File file = new File("gui.txt");
						try
						{
							FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);//The getAbsoluteFile() method is called on the File object, file
														    //to get the absolute path of the file, and 
														    //the true argument passed to the FileWriter constructor 
														    //means that the contents of the file will be 
														    //appended rather than overwritten each time the code is executed. 
							System.out.println("\nNAME: "+t1.getText()+"\nID: "+t2.getText()+"\nDOJ: "+t3.getText()+"\nDOB: "+t4.getText()+"\n");
							
							fw.write("\nNAME: "+t1.getText()+"\nID: "+t2.getText()+"\nDOJ: "+t3.getText()+"\nDOB: "+t4.getText()+"\n");
							
							fw.close();
						}
						catch(IOException e1)
						{
							e1.printStackTrace();
						}
					}
				});
		
		b2.addActionListener(new ActionListener()
				{
				public void actionPerformed(ActionEvent e)
				{
					t1.setText("");
					t2.setText("");
					t3.setText("");
					t4.setText("");
				}
				});
		
		p1.add(l1);
		p1.add(t1);
    
		p2.add(l2);
		p2.add(t2);
		
    		p3.add(l3);
		p3.add(t3);
		
    		p4.add(l4);
		p4.add(t4);
		
    		p5.add(b1);
		p6.add(b2);
		
    		frame.add(p1);
		frame.add(p2);
		frame.add(p3);
		frame.add(p4);
		frame.add(p5);
		frame.add(p6);
		
		/*frame.add(p7);
		frame.add(p8);
		frame.add(p9);
		frame.add(p10);*/
		
		frame.setVisible(true);
		
		
		
		
	}
}
