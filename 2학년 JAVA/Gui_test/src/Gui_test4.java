import javax.swing.*;
import java.awt.*;
public class Gui_test4 extends JFrame {
	public Gui_test4() {
		setTitle("BorderLayout ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridLayout grid = new GridLayout(4,2);
		grid.setVgap(5);
		
		setResizable(false);
		Container c=getContentPane();
		c.setLayout(grid);
		c.add(new JLabel("�̸�"));
		c.add(new JTextField(""));
		c.add(new JLabel("�й�"));
		c.add(new JTextField(""));
		c.add(new JLabel("�а�"));
		c.add(new JTextField(""));
		c.add(new JLabel("����"));
		c.add(new JTextField(""));
		
		setSize(300,200);
		setVisible(true);

	}

	public static void main(String []args) {
		new Gui_test4();
	}
}
