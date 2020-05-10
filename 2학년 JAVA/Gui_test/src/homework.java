import javax.swing.*;

import java.awt.*;

public class homework extends JFrame {
	homework(){
		setTitle("contentpane과 jfraem의 예제"); //프레임의 타이틀 달기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setSize(400,700);
		//setResizable(false); 
		Container c = getContentPane();//콘탠트팬 알아내기
		
		c.setBackground(Color.gray);//오랜지색 배경
		c.setLayout(new GridLayout(5,8,5,5)); //컨탠트팬에 FlowLayout
		
		String btn[]= {"X²","sin","cos","tan","CE"};
		
		for(int i=0; i<10; i++) {
			c.add(new JButton(btn[i]));
		}
		
		/*
		c.add(new JButton("X²"));// OK 버튼 달기
		c.add(new JButton("sin"));// Ignore 버튼 달기
		c.add(new JButton("cos"));
		c.add(new JButton("tan"));
		c.add(new JButton("CE"));
		c.add(new JButton("C"));
		c.add(new JButton("<-"));
		c.add(new JButton("÷"));
		
		c.add(new JButton("X³"));// OK 버튼 달기
		c.add(new JButton("y√x"));// Cancel 버튼 달기
		c.add(new JButton("sin-1"));// Ignore 버튼 달기
		c.add(new JButton("cos-1"));
		c.add(new JButton("tan-1"));
		c.add(new JButton("7"));
		c.add(new JButton("8"));
		c.add(new JButton("9"));
		c.add(new JButton("×"));

		c.add(new JButton("√"));// OK 버튼 달기
		c.add(new JButton("10ⁿ"));// Cancel 버튼 달기
		c.add(new JButton("log"));// Ignore 버튼 달기
		c.add(new JButton("Exp"));
		c.add(new JButton("Mod"));
		c.add(new JButton("4"));
		c.add(new JButton("5"));
		c.add(new JButton("6"));
		c.add(new JButton("－"));
		
		c.add(new JButton("1/x"));// OK 버튼 달기
		c.add(new JButton("eⁿ"));// Cancel 버튼 달기
		c.add(new JButton("In"));// Ignore 버튼 달기
		c.add(new JButton("dms"));
		c.add(new JButton("deg"));
		c.add(new JButton("1"));
		c.add(new JButton("2"));
		c.add(new JButton("3"));
		c.add(new JButton("＋"));
		
		c.add(new JButton(" "));// OK 버튼 달기
		c.add(new JButton("π"));// Cancel 버튼 달기
		c.add(new JButton("n!"));// Ignore 버튼 달기
		c.add(new JButton("("));
		c.add(new JButton(")"));
		c.add(new JButton("±"));
		c.add(new JButton("0"));
		c.add(new JButton("."));
		c.add(new JButton("="));
		//add(new JButton("Click"));
		 */
		setSize(450,720); //프레임 크기 300*150 설정
		setVisible(true); // 화면에 프레임 출력
		}

	public static void main(String []args) {
		new homework();
	}

}
