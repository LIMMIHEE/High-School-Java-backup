/*
import java.io.*;

public class test_1 {
	public static void main(String[] args) {
		byte b[] = {7,51,3,4,-1,24};
		try { 
			FileOutputStream fout = new FileOutputStream("test.out");
			for(int i=0; i<b.length; i++)
				fout.write(b[i]); // 배열 b의 바이너리를 그대로 기록
			fout.close();
		} catch(IOException e) {
			System.out.println("test.out에 저장할 수 없었습니다. 경로명을  확인해 주세요");
			return;
		}
		System.out.println("test.out을 저장하였습니다.");
	}
}
*/
/*
import java.io.*;
public class test_1 {
	public static void main(String[] args) {
		byte b[] = new byte [6]; // 비어 있는 byte 배열
		try {// "test.out" 파일을 읽어 배열 b에 저장
			FileInputStream fin = new FileInputStream("test.out");
			int n=0, c;
			while((c = fin.read())!= -1) { // -1은 파일 끝(EOF)
				b[n] = (byte)c; // 읽은 바이트를 배열에 저장
				n++; }
			System.out.println("test.out에서 읽은 배열을 출력합니다."); // 배열 b[]의 바이트 값을 모두 화면에 출력
			for(int i=0; i<b.length; i++)
				System.out.print(b[i] + " ");
			System.out.println();			
			fin.close();
		} catch(IOException e) {
			System.out.println("test.out에서 읽지 못했습니다. 경로명을 체크해보세요");
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
			System.out.println( src.getPath()+ "를 " + dest.getPath()+"로 복사하였습니다.");
		} catch (IOException e) {
			System.out.println("파일 복사 오류");
		}
	}
}
*/

import java.io.*;

public class test_1 {
	public static void main(String[] args){
		File src = new File("c:\\windows\\system.ini"); // 원본 파일 경로명
		File dest = new File("system.txt"); // 복사 파일 경로명
		int c;
		try {
			FileReader fr = new FileReader(src); // 파일 입력 문자 스트림 생성
			FileWriter fw = new FileWriter(dest); // 파일 출력 문자 스트림 생성
			while((c = fr.read()) != -1) { // 문자 하나 읽고
				fw.write((char)c); // 문자 하나 쓰고
			}
			fr.close();
			fw.close();
			System.out.println( src.getPath()+ "를 " + dest.getPath()+ "로 복사하였습니다.");
		} catch (IOException e) {
			System.out.println("파일 복사 오류");
		}
	}
}
