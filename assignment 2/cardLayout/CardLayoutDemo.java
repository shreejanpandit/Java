import java.awt.*;  
import java.awt.event.*;  
  
import javax.swing.*;  

class CardLayoutDemo extends JFrame implements ActionListener
{
 CardLayout card;
 JButton btn1,btn2,btn3,btn4,btn5;
 Container c;  

 CardLayoutDemo()
 {
 	c = getContentPane();
 	card  = new CardLayout(40,30);

 	c.setLayout(card);
 	btn1=new JButton("Apple");  
    btn2=new JButton("Boy");  
    btn3=new JButton("Cat");  

    btn1.addActionListener(this);
    btn2.addActionListener(this);
    btn3.addActionListener(this);

    c.add("a",btn1);
    c.add("b",btn2);
    c.add("c",btn3);
 }

 public void actionPerformed(ActionEvent e)
 {
 	card.next(c);
 }

 public static void main(String[] args) {
 	CardLayoutDemo c1 = new CardLayoutDemo();
 	c1.setSize(400,400);
 	c1.setVisible(true);
 	c1.setDefaultCloseOperation(EXIT_ON_CLOSE);
 }
}