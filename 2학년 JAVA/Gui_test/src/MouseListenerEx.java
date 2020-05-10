import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseListenerEx extends JFrame {
	JLabel la = new JLabel("Hello"); // "Hello" ��¿� ���̺�

	MouseListenerEx() {
		setTitle("Mouse �̺�Ʈ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.addMouseListener(new MyMouseListener());

		c.setLayout(null);
		la.setSize(50, 20); // ���̺��� ũ�� 50x20 ����
		la.setLocation(30, 30); // ���̺��� ��ġ (30,30)���� ����
		c.add(la); 

		setSize(200, 200);
		setVisible(true);
	}
	class MyMouseListener implements MouseListener {
		public void mousePressed(MouseEvent e) {
			int x = e.getX(); // ���콺�� Ŭ�� ��ǥ x
			int y = e.getY(); // ���콺�� Ŭ�� ��ǥ y
			la.setLocation(x, y); // (x,y) ��ġ�� ���̺� �̵�
		}

		public void mouseReleased(MouseEvent e) {}
		public void mouseClicked(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {}
	}

	public static void main(String [] args) {
		new MouseListenerEx();
	}
} 
