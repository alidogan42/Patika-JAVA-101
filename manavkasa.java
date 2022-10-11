package abc;
import java.util.Scanner;
public class manavkasa {

	
	public static void main(String[] args) {
		
    		double toplam,armutf=2.14,elmaf=3.67,domatesf=1.11,muzf=0.95,patlýcanf=5.00;
    		
    		Scanner inp =new Scanner(System.in);
    		System.out.print("Armut Kaç Kilo ? ");
    		double armut=inp.nextDouble();
    		System.out.print("Elma Kaç Kilo ?");
    		double elma=inp.nextDouble();
    		System.out.print("Domates Kaç Kilo ? ");
    		double domates=inp.nextDouble();
    		System.out.print("Muz Kaç Kilo ?");
    		double muz=inp.nextDouble();
    		System.out.print("Patlýcan Kaç Kilo ?");
    		double patlýcan=inp.nextDouble();
    		toplam=(armut*armutf)+(elma*elmaf) +(muz*muzf)+(domates*domatesf)+(patlýcan*patlýcanf);
    		System.out.println("toplam tutar   "+ toplam);}}
    		
    		
    		
    		
    		
    		
    		
    		
    		