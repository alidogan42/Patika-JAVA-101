package abc;
import java.util.Scanner;
public class etkinlik�nerme {

	public static void main(String[] args) {
		int heat;
		Scanner �np=new Scanner(System.in);
		System.out.print("bug�n hava kac derece ?");
		heat=�np.nextInt();
		
		if(heat<=5) {
			System.out.println("kayaga gidebilirsiniz");}
		
			else if(5<heat&&heat<25) {
			  if(heat<=15) {
					System.out.println("s�nemaya gidebilrisiniz");}
				
		       if(10<=heat){
					System.out.println("pikni�e gidebilirsiniz");
					
				}}
		 else if(heat>=25) {
					System.out.println("yuzmeye gidebilirsiz");
			}
		}

	}


