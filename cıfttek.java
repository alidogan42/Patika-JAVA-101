package abc;
import java.util.Scanner;
public class cýfttek {

	public static void main(String[] args) {
		int k;
		Scanner inp=new Scanner(System.in);
		
		System.out.println("lutfen bir sayý gýrýnýz");
		k=inp.nextInt();
		
		int i=1;
		while(i<=k) {
			i++;
			if(i%2 ==0) {
				System.out.println("cift sayýlar  "+i);
				i++;
			}
			
		}
		
	
		
	}

}
