package abc;
import java.util.Scanner;
public class kullanýcýarayuzu {

	public static void main(String[] args) {
		String username,pasword;
		Scanner inp=new Scanner(System.in);
		
		System.out.println("kullanýcý adýnýz");
		username=inp.nextLine();
		
		System.out.println("sifrenizi giriniz");
		pasword=inp.nextLine();
		
		if(username.equals("patika")&&pasword.equals("java123")) {
			System.out.println("giris yapatýnýz");
		}	else {
			System.out.println("yanliþ giris yaptýnýz");
		}

	}

}
