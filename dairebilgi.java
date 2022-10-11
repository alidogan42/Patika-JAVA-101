package abc;
import java.util.Scanner;
public class dairebilgi {

	public static void main(String[] args) {
		double r,alan,çevre,pi=3.14;
		Scanner inp =new Scanner(System.in);
		System.out.println("lütfen yarýçap uzunluðunu giriniz");
		r=inp.nextDouble();
		alan=r*r;
		çevre=2*pi*r;
		System.out.println("daire için bilgiler");
		System.out.println("yarýcapý     "+r); 
		System.out.println("alaný        "+alan); 
		System.out.println("çevresi      "+çevre); 
	}

}
