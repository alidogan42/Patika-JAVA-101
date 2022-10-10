package abc;
import java.util.Scanner;
public class taksimetre {

	public static void main(String[] args) {
	double km,kmtutar=(2.20),tutar;
	boolean kntrl;
	Scanner gýrdý=new Scanner(System.in);
	System.out.print("kac kilometre gidildi?");
	km=gýrdý.nextDouble();
	tutar=10+km*kmtutar;
	
	kntrl=20<=tutar;
	String toplamtutar = kntrl ? "\n ücret ="   +tutar:"mesafe kýsaydý ücret 20 tl";
	System.out.println(toplamtutar);

	}

}
