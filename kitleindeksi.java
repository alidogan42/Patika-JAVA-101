package abc;
import java.util.Scanner;
public class kitleindeksi {

    	public static void main(String[] args) {
    		double indeks,kilo,boy;
    		Scanner inp =new Scanner(System.in);
    		System.out.println("lütfen boy(m) uzunluðunu giriniz");
    		boy=inp.nextDouble();
    		System.out.println("lütfen kilonuzu(kg) giriniz");
    		kilo=inp.nextDouble();
    		indeks=kilo/ (boy* boy);
    		
    		System.out.println("             kiþi için bilgiler");
    		System.out.println("boyu                     "+boy); 
    		System.out.println("kilosu                   "+kilo); 
    		System.out.println("vücut kitle indeksi      "+indeks); 

	}

}
