import javax.swing.*;
import java.awt.*;

public class Gui_test_2 extends JFrame {
	Gui_test_2(){
		setTitle("contentpane과 jfraem의 예제"); //프레임의 타이틀 달기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane=getContentPane();
		
		contentPane.setLayout(new FlowLayout(FlowLayout.LEFT,30,40));
		contentPane.add(new JButton("add"));
		contentPane.add(new JButton("sub"));
		contentPane.add(new JButton("mul"));
		contentPane.add(new JButton("div"));
		contentPane.add(new JButton("Calculate"));
		
		
		setSize(1200,720); //프레임 크기 300*150 설정
		setVisible(true); // 화면에 프레임 출력
	}
	
	public static void main(String []args) {
		new Gui_test_2();
	}
}
