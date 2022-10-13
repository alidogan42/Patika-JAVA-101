package abc;
import java.util.Scanner;
public class bankamatik {

	public static void main(String[] args) {
		String username,pasword; 
		Scanner p=new Scanner(System.in);
		int right=3;
		int select,money,balance=2500;
		while(right>3);
		System.out.println("kullanýcý isminizi giriniz");
		username=p.nextLine();
		System.out.println("sifrenizi giriniz");
		pasword=p.nextLine();
		if(username.equals("patika")&&pasword.equals("dev123")) {
			System.out.println("merhaba kodluyoruz bankasýna hosgeldiniz");
			do {
				System.out.println("1-para yatýrma\n"
						+ "2-para cekme\n"
						+ "3-bakiye sorgulama\n"
						+ "4-cýkýs yap");
				System.out.println("lutfen bir iþlem seciniz");
				select=p.nextInt();
				
				if(select==1) {
					System.out.println("lutfen yatýrmak istediðiniz miktarý giriniz");
					money=p.nextInt();
					balance+=money;
					System.out.println("bakiye miktarniz\t  "+balance);
				}
				if(select==2) {
					System.out.println("lutfen cekmek istediðiniz miktarý giriniz");
					money=p.nextInt();
					balance-=money;
					System.out.println("bakiye miktarniz\t  "+balance);
				}
				if(select==3) {
					System.out.println("bakiye miktarniz\t  "+balance);
					
				}}
				while(select<4); {
					System.out.println("gule gule yine bekleriz bankamýza");
				}
			
			
		}else {
			System.out.println("yanliþ sifre yada kullanýcý adý");
	

	}

}}
