package abc;

public class polindromsay� {
	static boolean ispolindrom(int number) {
		int temp=number,reversenumber=0,lastnumber;
		while(temp!=0) {
			System.out.println("*****************");
			System.out.println("say� =>"+temp);
			
			lastnumber=temp%10;
			System.out.println("son basamak =>"+lastnumber);
			
			reversenumber=(reversenumber*10)+lastnumber;
			System.out.println("yeni say� =>"+reversenumber);
			temp/=10;
		}
		if(number==reversenumber)
		return true;
		else
			return false;
		

		}
	  public static void main(String[] args) {
		  System.out.println(  " \n say� polindromu ? "+ispolindrom(1221));
		
		 
	}

}
