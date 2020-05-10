import javax.swing.*;
import java.awt.*;
public class Gui_test3 extends JFrame{
	Gui_test3(){
		setTitle("BorderLayout ¿¹Á¦");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		
		contentPane.setLayout(new BorderLayout(30,20));
		contentPane.add(new JButton("Calculate"),BorderLayout.CENTER);
		contentPane.add(new JButton("add"),BorderLayout.NORTH);
		contentPane.add(new JButton("sub"),BorderLayout.SOUTH);
		contentPane.add(new JButton("mul"),BorderLayout.EAST);
		contentPane.add(new JButton("dov"),BorderLayout.WEST);
		
		setSize(300,200);
		setVisible(true);
		
	}
	public static void main(String []args) {
		new Gui_test3();
	}
}
