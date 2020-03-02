import java.awt.*;
import javax.swing.*;

class FlowLayoutDemo
{
	FlowLayoutDemo()
	{
		JFrame f = new JFrame();

		JButton btn1 = new JButton("A");
		JButton btn2 = new JButton("S");
		JButton btn3 = new JButton("M");
		JButton btn4 = new JButton("I");
		JButton btn5 = new JButton("T");

		f.add(btn1);
		f.add(btn2);
		f.add(btn3);
		f.add(btn4);
		f.add(btn5);

		f.setLayout(new FlowLayout(FlowLayout.LEFT));
		f.setSize(300,300);
		f.setVisible(true);
	}

	public static void main(String[] args)
	{
		new FlowLayoutDemo();
	}
}