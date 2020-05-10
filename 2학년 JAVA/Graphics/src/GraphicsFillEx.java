import javax.swing.*;
import java.awt.*;

public class GraphicsFillEx extends JFrame {
	private MyPanel panel = new MyPanel();
	public GraphicsFillEx() {
		setTitle("fillXXX 사용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(100, 350);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			/*
			g.setColor(Color.RED);
			g.fillRect(10,10,50,50);
			g.setColor(Color.BLUE);
			g.fillOval(10,70,50,50);
			g.setColor(Color.GREEN);
			g.fillRoundRect(10,130,50,50,20,20);
			g.setColor(Color.MAGENTA);
			g.fillArc(10,190,50,50,0,120); 
			g.setColor(Color.GREEN);

			g.setColor(Color.white);
			g.fillArc(10,190,50,50,0,-360); 
			g.setColor(Color.MAGENTA);
			g.fillArc(10,190,50,50,0,-300); 
			g.setColor(Color.BLUE);
			g.fillArc(10,190,50,50,0,-240);
			g.setColor(Color.GREEN);
			g.fillArc(10,190,50,50,0,-180);
			g.setColor(Color.YELLOW);
			g.fillArc(10,190,50,50,0,-120);
			g.setColor(Color.ORANGE);
			g.fillArc(10,190,50,50,0,-60); 
			g.setColor(Color.RED);
			g.fillArc(10,190,50,50,0,60);



			g.setColor(Color.ORANGE);
			*/
			g.setColor(Color.ORANGE);
			g.fillArc(10,190,50,50,0,360); 
			g.fillArc(10,185,18,18,0,360); 
			g.fillArc(41,185,18,18,0,360); 
			
			g.setColor(Color.white);
			g.fillArc(27,217,8,8,0,360);
			g.fillArc(37,217,8,8,0,360);
			
			g.setColor(Color.black);
			g.fillArc(23,210,4,4,0,360);
			g.fillArc(42,210,4,4,0,360);
			g.fillArc(33,216,5,5,0,360);
			g.fillArc(20,204,10,4,0,360);
			g.fillArc(40,204,10,4,0,360);
			
			int [] x ={30,10,30,60};
			int [] y ={250,275,300,275};
			g.fillPolygon(x, y, 4); 
		}
	}	
	public static void main(String [] args) {
		new GraphicsFillEx();
	}
}
