package abc;
import java.util.Scanner;
public class kdvhesap {

	public static void main(String[] args) {
	double tutar,kdv,kdvli,kdvoran=0.18;
	Scanner inp =new Scanner(System.in);
	
    System.out.println("lütfen kdvsi hesaplanacak parayý giriniz");
     tutar=inp.nextDouble();
     kdv=tutar*kdvoran;
     kdvli=tutar+kdv;
     System.out.println("para        "+tutar);
     System.out.println("kdvoran     "+kdvoran);
     System.out.println("kdv         "+kdv);
     System.out.println("kdvli para  "+kdvli);
  
	}

}
