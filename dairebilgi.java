package abc;
import java.util.Scanner;
public class dairebilgi {

	public static void main(String[] args) {
		double r,alan,�evre,pi=3.14;
		Scanner inp =new Scanner(System.in);
		System.out.println("l�tfen yar��ap uzunlu�unu giriniz");
		r=inp.nextDouble();
		alan=r*r;
		�evre=2*pi*r;
		System.out.println("daire i�in bilgiler");
		System.out.println("yar�cap�     "+r); 
		System.out.println("alan�        "+alan); 
		System.out.println("�evresi      "+�evre); 
	}

}
