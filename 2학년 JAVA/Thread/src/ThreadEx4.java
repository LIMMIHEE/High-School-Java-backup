
public class ThreadEx4 {
	public static void main(String []args) {
		long starttime= System.currentTimeMillis();
		
		for(int i=0; i< 300; i++) {
			System.out.println("-");
		}
			System.out.print("�ҿ�ð�1 : "+
			(System.currentTimeMillis()-starttime));
		
		
		
		for(int i=0; i< 300; i++) {
			System.out.println(" | ");
		}
			System.out.print("�ҿ�ð�2 : "+
			(System.currentTimeMillis()-starttime));
		
	}
}
