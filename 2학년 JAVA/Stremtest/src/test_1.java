/*
import java.io.*;

public class test_1 {
	public static void main(String[] args) {
		byte b[] = {7,51,3,4,-1,24};
		try { 
			FileOutputStream fout = new FileOutputStream("test.out");
			for(int i=0; i<b.length; i++)
				fout.write(b[i]); // �迭 b�� ���̳ʸ��� �״�� ���
			fout.close();
		} catch(IOException e) {
			System.out.println("test.out�� ������ �� �������ϴ�. ��θ���  Ȯ���� �ּ���");
			return;
		}
		System.out.println("test.out�� �����Ͽ����ϴ�.");
	}
}
*/
/*
import java.io.*;
public class test_1 {
	public static void main(String[] args) {
		byte b[] = new byte [6]; // ��� �ִ� byte �迭
		try {// "test.out" ������ �о� �迭 b�� ����
			FileInputStream fin = new FileInputStream("test.out");
			int n=0, c;
			while((c = fin.read())!= -1) { // -1�� ���� ��(EOF)
				b[n] = (byte)c; // ���� ����Ʈ�� �迭�� ����
				n++; }
			System.out.println("test.out���� ���� �迭�� ����մϴ�."); // �迭 b[]�� ����Ʈ ���� ��� ȭ�鿡 ���
			for(int i=0; i<b.length; i++)
				System.out.print(b[i] + " ");
			System.out.println();			
			fin.close();
		} catch(IOException e) {
			System.out.println("test.out���� ���� ���߽��ϴ�. ��θ��� üũ�غ�����");
		}}}
*/
/*
import java.io.*;

public class test_1{
	public static void main(String[] args) {
		File src = new File( "c:\\Windows\\Web\\Wallpaper\\Theme1\\img1.jpg");
		File dest = new File("copyimg.jpg"); 
		int c;
		try {
			FileInputStream fi = new FileInputStream(src); 
			FileOutputStream fo = new FileOutputStream(dest); 
			while((c = fi.read()) != -1) {
				fo.write((byte)c);
			}
			fi.close();
			fo.close();
			System.out.println( src.getPath()+ "�� " + dest.getPath()+"�� �����Ͽ����ϴ�.");
		} catch (IOException e) {
			System.out.println("���� ���� ����");
		}
	}
}
*/

import java.io.*;

public class test_1 {
	public static void main(String[] args){
		File src = new File("c:\\windows\\system.ini"); // ���� ���� ��θ�
		File dest = new File("system.txt"); // ���� ���� ��θ�
		int c;
		try {
			FileReader fr = new FileReader(src); // ���� �Է� ���� ��Ʈ�� ����
			FileWriter fw = new FileWriter(dest); // ���� ��� ���� ��Ʈ�� ����
			while((c = fr.read()) != -1) { // ���� �ϳ� �а�
				fw.write((char)c); // ���� �ϳ� ����
			}
			fr.close();
			fw.close();
			System.out.println( src.getPath()+ "�� " + dest.getPath()+ "�� �����Ͽ����ϴ�.");
		} catch (IOException e) {
			System.out.println("���� ���� ����");
		}
	}
}
