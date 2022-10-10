package abc;

import java.util.Scanner;

public class hipotenüshesap {

	public static void main(String[] args) {
		double a,b,hipo0;
		Scanner inp =new Scanner(System.in);
		System.out.println("lütfen dik kenar uzunluklarýný sýrasýyla giriniz");
		a=inp.nextDouble();
		b=inp.nextDouble();
		hipo0=Math.sqrt((a*a)+(b*b));
		System.out.println(hipo0); 
	}

}
