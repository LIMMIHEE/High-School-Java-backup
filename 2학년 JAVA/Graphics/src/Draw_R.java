import javax.swing.*;


import java.awt.*;

public class Draw_R extends JFrame {
	private MyPanel panel = new MyPanel();
	public Draw_R() {
		setTitle("fillXXX ��� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(100, 350);
		setVisible(true);
	}
}
