package abc;
import java.util.Scanner;
public class kitleindeksi {

    	public static void main(String[] args) {
    		double indeks,kilo,boy;
    		Scanner inp =new Scanner(System.in);
    		System.out.println("l�tfen boy(m) uzunlu�unu giriniz");
    		boy=inp.nextDouble();
    		System.out.println("l�tfen kilonuzu(kg) giriniz");
    		kilo=inp.nextDouble();
    		indeks=kilo/ (boy* boy);
    		
    		System.out.println("             ki�i i�in bilgiler");
    		System.out.println("boyu                     "+boy); 
    		System.out.println("kilosu                   "+kilo); 
    		System.out.println("v�cut kitle indeksi      "+indeks); 

	}

}
