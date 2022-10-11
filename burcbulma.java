package abc;
import java.util.Scanner;
public class burcbulma {

	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		int month,day;
		String burc="";
		boolean iserror=false;
		
		System.out.println("lutfen doðduðunuz ayý sayý olarak giriniz");
		month=inp.nextInt();
		System.out.println("lutfen doðdugunuz günü sayý olarak  giriniz");
		day=inp.nextInt();
		
		switch(month) {
		case 1:
		    if(1<=day&&day<=31) {
		    	if(day<22) {
		    		burc= "oglak";
		    		
		    	}else {
		    		burc="kova";
		    	}}
		    else {
		    	iserror=true;
		    }break;
		case 2:
		    if(1<=day&&day<=28) {
		    	if(day<20) {
		    		burc= "kova";
		    		
		    	}else {
		    		burc="balýk";
		    	}}
		    else {
		    	iserror=true;
		    }break;
		case 3:
		    if(1<=day&&day<=31) {
		    	if(day<21) {
		    		burc= "balýk";
		    		
		    	}else {
		    		burc="koç";
		    	}}
		    else {
		    	iserror=true;
		    }break;
		case 4:
		    if(1<=day&&day<=30) {
		    	if(day<22) {
		    		burc= "koç";
		    		
		    	}else {
		    		burc="boða";
		    	}}
		    else {
		    	iserror=true;
		    }break;
		case 5:
		    if(1<=day&&day<=31) {
		    	if(day<22) {
		    		burc= "boða";
		    		
		    	}else {
		    		burc="ikizler";
		    	}}
		    else {
		    	iserror=true;
		    }break;
		case 6:
		    if(1<=day&&day<=30) {
		    	if(day<23) {
		    		burc= "ikizler";
		    		
		    	}else {
		    		burc="yengeç";
		    	}}
		    else {
		    	iserror=true;
		    }break;
		case 7:
		    if(1<=day&&day<=31) {
		    	if(day<23) {
		    		burc= "yengec";
		    		
		    	}else {
		    		burc="aslan";
		    	}}
		    else {
		    	iserror=true;
		    }break;
		case 8:
		    if(1<=day&&day<=31) {
		    	if(day<23) {
		    		burc= "aslan";
		    		
		    	}else {
		    		burc="basak";
		    	}}
		    else {
		    	iserror=true;
		    }break;
		case 9:
		    if(1<=day&&day<=30) {
		    	if(day<23) {
		    		burc= "basak";
		    		
		    	}else {
		    		burc="terazi";
		    	}}
		    else {
		    	iserror=true;
		    }break;
		case 10:
		    if(1<=day&&day<=31) {
		    	if(day<23) {
		    		burc= "terazi";
		    		
		    	}else {
		    		burc="akrep";
		    	}}
		    else {
		    	iserror=true;
		    }break;
		case 11:
		    if(1<=day&&day<=30) {
		    	if(day<22) {
		    		burc= "akrep";
		    		
		    	}else {
		    		burc="yay";
		    	}}
		    else {
		    	iserror=true;
		    }break;
		case 12:
			if(1<=day&&day<=31) {
				if(day<22) {
					burc="yay";
				}else {
					burc="oðlak";
				}}else {
			      
					iserror=true;
				}break;
			
		default:
			iserror=true;
		}
		   if(iserror) {
			System.out.println("hatalý sayý girdiniz\n");
		   }else {
			   System.out.println("burcunuz=\t"+burc);
		    	
		
		
		    }}}