import javax.swing.*;
import java.awt.*;

public class GraphicsDrawImageEx3 extends JFrame {
	private MyPanel panel = new MyPanel();

	public GraphicsDrawImageEx3() {
		setTitle("�̹��� �Ϻκ��� ũ�� �����Ͽ� �׸���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(300, 300);
		setVisible(true);
	}
	class MyPanel extends JPanel {
		private ImageIcon icon = new ImageIcon("image/image0.jpg");
		private Image img = icon.getImage();
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 200, 200, 150, 20, 20, 60, 0, 0, this);
		}
	}
	public static void main(String [] args) {
		new GraphicsDrawImageEx3();
	}
}
