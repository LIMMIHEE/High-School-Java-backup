import java.io.*;
import java.util.*;

public class test {
	public static void main(String[] args){
		System.out.println("��ȭ��ȣ �Է� ���α׷��Դϴ�.");
		Scanner sc=new Scanner(System.in);
		File f = new File("Phone.txt");
		
		try {
			FileWriter fw = null; // ���� ��� ���� ��Ʈ�� ����
			fw=new FileWriter(f);
			while(true) { // ���� �ϳ� �а�
				System.out.print("name PhoneNumber >> ");
				String line = sc.nextLine();
				if(line.contentEquals("�׸�"))
					break;
				fw.write(line+"\r\n"); // ���� �ϳ� ����
			}
			sc.close();
			fw.close();
		} catch (IOException e) {
			
		}
		
		System.out.println("Phone.txt�� ����Ǿ����ϴ�.");
	}
}
