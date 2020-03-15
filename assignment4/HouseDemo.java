import java.awt.*;


public class HouseDemo extends Frame
{
	int y[] = {150, 40, 150};
	int x[] = { 100, 200, 300};
	HouseDemo()
	{
		setSize(400,400);
		setVisible(true);
	}
	public void paint(Graphics g)
	{	
		g.setColor(Color.RED);
		g.fillRect(100,150,200,150);
		g.setColor(Color.GREEN);
		g.fillPolygon(x,y,3);
		g.setColor(Color.WHITE);
		g.drawLine(150,200,250,200);
		g.drawLine(150,230,250,230);

		g.drawLine(150,200,150,230);
		g.drawLine(250,200,250,230);




	}

	public static void main(String[] args)
	{
		new HouseDemo();
	}
}