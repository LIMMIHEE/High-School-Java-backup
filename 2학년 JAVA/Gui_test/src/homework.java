import javax.swing.*;

import java.awt.*;

public class homework extends JFrame {
	homework(){
		setTitle("contentpane�� jfraem�� ����"); //�������� Ÿ��Ʋ �ޱ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setSize(400,700);
		//setResizable(false); 
		Container c = getContentPane();//����Ʈ�� �˾Ƴ���
		
		c.setBackground(Color.gray);//�������� ���
		c.setLayout(new GridLayout(5,8,5,5)); //����Ʈ�ҿ� FlowLayout
		
		String btn[]= {"X��","sin","cos","tan","CE"};
		
		for(int i=0; i<10; i++) {
			c.add(new JButton(btn[i]));
		}
		
		/*
		c.add(new JButton("X��"));// OK ��ư �ޱ�
		c.add(new JButton("sin"));// Ignore ��ư �ޱ�
		c.add(new JButton("cos"));
		c.add(new JButton("tan"));
		c.add(new JButton("CE"));
		c.add(new JButton("C"));
		c.add(new JButton("<-"));
		c.add(new JButton("��"));
		
		c.add(new JButton("X��"));// OK ��ư �ޱ�
		c.add(new JButton("y��x"));// Cancel ��ư �ޱ�
		c.add(new JButton("sin-1"));// Ignore ��ư �ޱ�
		c.add(new JButton("cos-1"));
		c.add(new JButton("tan-1"));
		c.add(new JButton("7"));
		c.add(new JButton("8"));
		c.add(new JButton("9"));
		c.add(new JButton("��"));

		c.add(new JButton("��"));// OK ��ư �ޱ�
		c.add(new JButton("10��"));// Cancel ��ư �ޱ�
		c.add(new JButton("log"));// Ignore ��ư �ޱ�
		c.add(new JButton("Exp"));
		c.add(new JButton("Mod"));
		c.add(new JButton("4"));
		c.add(new JButton("5"));
		c.add(new JButton("6"));
		c.add(new JButton("��"));
		
		c.add(new JButton("1/x"));// OK ��ư �ޱ�
		c.add(new JButton("e��"));// Cancel ��ư �ޱ�
		c.add(new JButton("In"));// Ignore ��ư �ޱ�
		c.add(new JButton("dms"));
		c.add(new JButton("deg"));
		c.add(new JButton("1"));
		c.add(new JButton("2"));
		c.add(new JButton("3"));
		c.add(new JButton("��"));
		
		c.add(new JButton(" "));// OK ��ư �ޱ�
		c.add(new JButton("��"));// Cancel ��ư �ޱ�
		c.add(new JButton("n!"));// Ignore ��ư �ޱ�
		c.add(new JButton("("));
		c.add(new JButton(")"));
		c.add(new JButton("��"));
		c.add(new JButton("0"));
		c.add(new JButton("."));
		c.add(new JButton("="));
		//add(new JButton("Click"));
		 */
		setSize(450,720); //������ ũ�� 300*150 ����
		setVisible(true); // ȭ�鿡 ������ ���
		}

	public static void main(String []args) {
		new homework();
	}

}
