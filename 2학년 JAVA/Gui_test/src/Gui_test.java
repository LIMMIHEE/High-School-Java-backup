import javax.swing.*;
import java.awt.*;
public class Gui_test extends JFrame {
	Gui_test(){
		setTitle("contentpane�� jfraem�� ����"); //�������� Ÿ��Ʋ �ޱ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();//����Ʈ�� �˾Ƴ���
		c.setBackground(Color.ORANGE);//�������� ���
		c.setLayout(new FlowLayout());//����Ʈ�ҿ� FlowLayout
		
		c.add(new JButton("OK"));// OK ��ư �ޱ�
		c.add(new JButton("Cancel"));// Cancel ��ư �ޱ�
		c.add(new JButton("Ignore"));// Ignore ��ư �ޱ�
		//add(new JButton("Click"));
		
		setSize(1200,720); //������ ũ�� 300*150 ����
		setVisible(true); // ȭ�鿡 ������ ���
	}
	
	public static void main(String []args) {
		new Gui_test();
	}
}
