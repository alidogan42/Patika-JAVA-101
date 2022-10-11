package abc;
import java.util.Scanner;
public class etkinlikÖnerme {

	public static void main(String[] args) {
		int heat;
		Scanner ınp=new Scanner(System.in);
		System.out.print("bugün hava kac derece ?");
		heat=ınp.nextInt();
		
		if(heat<=5) {
			System.out.println("kayaga gidebilirsiniz");}
		
			else if(5<heat&&heat<25) {
			  if(heat<=15) {
					System.out.println("sınemaya gidebilrisiniz");}
				
		       if(10<=heat){
					System.out.println("pikniğe gidebilirsiniz");
					
				}}
		 else if(heat>=25) {
					System.out.println("yuzmeye gidebilirsiz");
			}
		}

	}


