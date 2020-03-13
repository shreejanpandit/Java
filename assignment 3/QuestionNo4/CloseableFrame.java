mport javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JDesktopPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.*;
import java.awt.event.*;

public class CreateInternalFrame {
	
	JFrame frame;
	JInternalFrame inner1, inner2, inner3, inner4, inner5, inner6;
	JButton button;
	JPanel panel;
	JLabel lable;
	JDesktopPane desktop = new JDesktopPane();	
	boolean resizable = true, closable = true, maximizable = true,
	iconifiable = true;
	int pos = 25;
	int width = 200, height = 100; 
	
	public void createMainFrameGUI()
	{
		frame = new JFrame("Main Frame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		frame.setLayout(new BorderLayout());		
		button = new JButton("Create Frames");
		panel = new JPanel();
		button.setBounds(50, 150, 100, 20);
		button.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				createInternalFrameGUI();
			}
		}
		);
		panel.add(button);		
		frame.add(panel);		
		frame.setVisible(true);
		frame.setSize(400, 300);		
	}
	
	public void createInternalFrameGUI()
	{
		inner1 = new JInternalFrame();
		inner1.setBounds(0, 0, width, height);
		
		inner2 = new JInternalFrame("Frame title1");
		inner2.setBounds(1*pos, 1* pos, width, height);
		
		inner3 = new JInternalFrame("Frame title2", resizable);
		inner3.setBounds(2 * pos, 2 * pos, width, height);
		
		inner4 = new JInternalFrame("Frame title3", resizable, closable);
		inner4.setBounds(3 * pos, 3 * pos, width, height);
		
		inner5 = new JInternalFrame("Frame title4", resizable, closable, maximizable);
		inner5.setBounds(4 * pos, 4 * pos, width, height);
		
		inner6 = new JInternalFrame("Frame title5", resizable, closable, maximizable, iconifiable);
		inner6.setBounds(5 * pos, 5 * pos, width, height);
		
		inner1.setVisible(true);
		inner2.setVisible(true);
		inner3.setVisible(true);
		inner4.setVisible(true);
		inner5.setVisible(true);
		inner6.setVisible(true);
		
		desktop.add(inner6);
		desktop.add(inner5);
		desktop.add(inner4);
		desktop.add(inner3);
		desktop.add(inner2);
		desktop.add(inner1);
		frame.add(desktop);
		frame.setContentPane(desktop);
		desktop.setDragMode(JDesktopPane.OUTLINE_DRAG_MODE);
	}
	public static void main(String args[])
	{
		CreateInternalFrame cif = new CreateInternalFrame();
		cif.createMainFrameGUI();
	}
}