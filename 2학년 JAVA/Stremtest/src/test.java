import java.io.*;
import java.util.*;

public class test {
	public static void main(String[] args){
		System.out.println("전화번호 입력 프로그램입니다.");
		Scanner sc=new Scanner(System.in);
		File f = new File("Phone.txt");
		
		try {
			FileWriter fw = null; // 파일 출력 문자 스트림 생성
			fw=new FileWriter(f);
			while(true) { // 문자 하나 읽고
				System.out.print("name PhoneNumber >> ");
				String line = sc.nextLine();
				if(line.contentEquals("그만"))
					break;
				fw.write(line+"\r\n"); // 문자 하나 쓰고
			}
			sc.close();
			fw.close();
		} catch (IOException e) {
			
		}
		
		System.out.println("Phone.txt에 저장되었습니다.");
	}
}
