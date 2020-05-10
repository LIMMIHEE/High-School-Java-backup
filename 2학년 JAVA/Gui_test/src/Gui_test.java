import javax.swing.*;
import java.awt.*;
public class Gui_test extends JFrame {
	Gui_test(){
		setTitle("contentpane과 jfraem의 예제"); //프레임의 타이틀 달기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();//콘탠트팬 알아내기
		c.setBackground(Color.ORANGE);//오랜지색 배경
		c.setLayout(new FlowLayout());//컨탠트팬에 FlowLayout
		
		c.add(new JButton("OK"));// OK 버튼 달기
		c.add(new JButton("Cancel"));// Cancel 버튼 달기
		c.add(new JButton("Ignore"));// Ignore 버튼 달기
		//add(new JButton("Click"));
		
		setSize(1200,720); //프레임 크기 300*150 설정
		setVisible(true); // 화면에 프레임 출력
	}
	
	public static void main(String []args) {
		new Gui_test();
	}
}
