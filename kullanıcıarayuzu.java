package abc;
import java.util.Scanner;
public class kullan�c�arayuzu {

	public static void main(String[] args) {
		String username,pasword;
		Scanner inp=new Scanner(System.in);
		
		System.out.println("kullan�c� ad�n�z");
		username=inp.nextLine();
		
		System.out.println("sifrenizi giriniz");
		pasword=inp.nextLine();
		
		if(username.equals("patika")&&pasword.equals("java123")) {
			System.out.println("giris yapat�n�z");
		}	else {
			System.out.println("yanli� giris yapt�n�z");
		}

	}

}
