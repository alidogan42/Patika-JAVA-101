package abc;
import java.util.Scanner;
public class manavkasa {

	
	public static void main(String[] args) {
		
    		double toplam,armutf=2.14,elmaf=3.67,domatesf=1.11,muzf=0.95,patl�canf=5.00;
    		
    		Scanner inp =new Scanner(System.in);
    		System.out.print("Armut Ka� Kilo ? ");
    		double armut=inp.nextDouble();
    		System.out.print("Elma Ka� Kilo ?");
    		double elma=inp.nextDouble();
    		System.out.print("Domates Ka� Kilo ? ");
    		double domates=inp.nextDouble();
    		System.out.print("Muz Ka� Kilo ?");
    		double muz=inp.nextDouble();
    		System.out.print("Patl�can Ka� Kilo ?");
    		double patl�can=inp.nextDouble();
    		toplam=(armut*armutf)+(elma*elmaf) +(muz*muzf)+(domates*domatesf)+(patl�can*patl�canf);
    		System.out.println("toplam tutar   "+ toplam);}}
    		
    		
    		
    		
    		
    		
    		
    		
    		