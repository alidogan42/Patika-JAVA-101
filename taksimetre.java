package abc;
import java.util.Scanner;
public class taksimetre {

	public static void main(String[] args) {
	double km,kmtutar=(2.20),tutar;
	boolean kntrl;
	Scanner g�rd�=new Scanner(System.in);
	System.out.print("kac kilometre gidildi?");
	km=g�rd�.nextDouble();
	tutar=10+km*kmtutar;
	
	kntrl=20<=tutar;
	String toplamtutar = kntrl ? "\n �cret ="   +tutar:"mesafe k�sayd� �cret 20 tl";
	System.out.println(toplamtutar);

	}

}
