package abc;
import java.util.Scanner;
public class bankamatik {

	public static void main(String[] args) {
		String username,pasword; 
		Scanner p=new Scanner(System.in);
		int right=3;
		int select,money,balance=2500;
		while(right>3);
		System.out.println("kullan�c� isminizi giriniz");
		username=p.nextLine();
		System.out.println("sifrenizi giriniz");
		pasword=p.nextLine();
		if(username.equals("patika")&&pasword.equals("dev123")) {
			System.out.println("merhaba kodluyoruz bankas�na hosgeldiniz");
			do {
				System.out.println("1-para yat�rma\n"
						+ "2-para cekme\n"
						+ "3-bakiye sorgulama\n"
						+ "4-c�k�s yap");
				System.out.println("lutfen bir i�lem seciniz");
				select=p.nextInt();
				
				if(select==1) {
					System.out.println("lutfen yat�rmak istedi�iniz miktar� giriniz");
					money=p.nextInt();
					balance+=money;
					System.out.println("bakiye miktarniz\t  "+balance);
				}
				if(select==2) {
					System.out.println("lutfen cekmek istedi�iniz miktar� giriniz");
					money=p.nextInt();
					balance-=money;
					System.out.println("bakiye miktarniz\t  "+balance);
				}
				if(select==3) {
					System.out.println("bakiye miktarniz\t  "+balance);
					
				}}
				while(select<4); {
					System.out.println("gule gule yine bekleriz bankam�za");
				}
			
			
		}else {
			System.out.println("yanli� sifre yada kullan�c� ad�");
	

	}

}}
