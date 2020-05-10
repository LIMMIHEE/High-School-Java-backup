import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class ReMakePaint extends JFrame implements MouseMotionListener {
	private int x=-10, y=-10;
	private Color color ;
	private Color_win cw;
	
	
	public ReMakePaint() {
		Panel panel = new Panel();
		JLabel label = new JLabel("Paint",JLabel.RIGHT);
		panel.setLayout(new GridLayout(7,1));
		
		setTitle("drawing Line by Mouse");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = this.getContentPane();
		
		
		
		
		
		JButton Change_Pen_Blue = new JButton();
		Change_Pen_Blue.setBackground(Color.BLUE);
		panel.add(Change_Pen_Blue);
		Change_Pen_Blue.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ChangeColor_Pen("Blue");
			}
		});
		JButton Change_Pen_Red = new JButton();
		Change_Pen_Red.setBackground(Color.RED);
		panel.add(Change_Pen_Red);
		Change_Pen_Red.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ChangeColor_Pen("RED");
			}
		});
		JButton Change_Pen_YELLOW = new JButton();
		Change_Pen_YELLOW.setBackground(Color.YELLOW);
		panel.add(Change_Pen_YELLOW);
		Change_Pen_YELLOW.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ChangeColor_Pen("YELLOW");
			}
		});
		JButton Change_Pen_BLACK = new JButton();
		Change_Pen_BLACK.setBackground(Color.BLACK);
		panel.add(Change_Pen_BLACK);
		Change_Pen_BLACK.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ChangeColor_Pen("BLACK");
			}
		});
		JButton Change_Pen_White = new JButton();
		Change_Pen_White.setBackground(Color.WHITE);
		panel.add(Change_Pen_White);
		Change_Pen_White.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ChangeColor_Pen("White");
			}
		});
		JButton Change_Pen_Custom = new JButton();
		Change_Pen_Custom.setText("Custom Color");
		panel.add(Change_Pen_Custom);
		Change_Pen_Custom.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
		
				cw = new Color_win();
				System.out.println(cw.getColor());
				color =cw.getColor();
			}
		});
		c.setLayout(new BorderLayout());
		c.add(label, BorderLayout.SOUTH);
		c.addMouseMotionListener( this);
		c.add(panel,BorderLayout.EAST);
		setSize(900, 700);
		setVisible(true);
	}
	public void ChangeColor_Pen(String s) {
		switch(s) {
		case "Blue": color = Color.BLUE; break;
		case "RED": color = Color.RED; break;
		case "YELLOW": color = Color.YELLOW; break;
		case "White": color = Color.WHITE; break;
		case "BLACK": color = Color.BLACK; break;
		}
	}
	public void mouseMoved(MouseEvent e) {
		
	}
	public void mouseDragged(MouseEvent e) {
		x = e.getX(); y = e.getY();
		repaint();
	}

	public void paint(Graphics g) {
		g.setColor(color);
		g.fillOval(x, y, 4, 4);
	}
	public static void main(String [] args) {
		ReMakePaint p = new ReMakePaint();
	}
	
}

class Color_win extends JFrame implements ChangeListener{
	 Color ch_c;
	JColorChooser  color_ch = new JColorChooser();
	Color_win(){
		Panel panel_color = new Panel();
		setContentPane(panel_color);
		panel_color.add(color_ch);
		setSize(600,800);
        setResizable(false);
        setVisible(true);
	}
	@Override
	public void stateChanged(ChangeEvent e) {
		ch_c = color_ch.showDialog(null, "Color", Color.YELLOW);
	}
	public Color getColor() {
		return ch_c;
	}
}