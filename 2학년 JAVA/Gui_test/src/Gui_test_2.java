import javax.swing.*;
import java.awt.*;

public class Gui_test_2 extends JFrame {
	Gui_test_2(){
		setTitle("contentpane�� jfraem�� ����"); //�������� Ÿ��Ʋ �ޱ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane=getContentPane();
		
		contentPane.setLayout(new FlowLayout(FlowLayout.LEFT,30,40));
		contentPane.add(new JButton("add"));
		contentPane.add(new JButton("sub"));
		contentPane.add(new JButton("mul"));
		contentPane.add(new JButton("div"));
		contentPane.add(new JButton("Calculate"));
		
		
		setSize(1200,720); //������ ũ�� 300*150 ����
		setVisible(true); // ȭ�鿡 ������ ���
	}
	
	public static void main(String []args) {
		new Gui_test_2();
	}
}
