package abc;
import java.util.Scanner;
public class c�fttek {

	public static void main(String[] args) {
		int k;
		Scanner inp=new Scanner(System.in);
		
		System.out.println("lutfen bir say� g�r�n�z");
		k=inp.nextInt();
		
		int i=1;
		while(i<=k) {
			i++;
			if(i%2 ==0) {
				System.out.println("cift say�lar  "+i);
				i++;
			}
			
		}
		
	
		
	}

}
