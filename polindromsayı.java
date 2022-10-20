package abc;

public class polindromsayı {
	static boolean ispolindrom(int number) {
		int temp=number,reversenumber=0,lastnumber;
		while(temp!=0) {
			System.out.println("*****************");
			System.out.println("sayı =>"+temp);
			
			lastnumber=temp%10;
			System.out.println("son basamak =>"+lastnumber);
			
			reversenumber=(reversenumber*10)+lastnumber;
			System.out.println("yeni sayı =>"+reversenumber);
			temp/=10;
		}
		if(number==reversenumber)
		return true;
		else
			return false;
		

		}
	  public static void main(String[] args) {
		  System.out.println(  " \n sayı polindromu ? "+ispolindrom(1221));
		
		 
	}

}
