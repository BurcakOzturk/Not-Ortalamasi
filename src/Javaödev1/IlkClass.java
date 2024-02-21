package Javaödev1;
import java.util.Scanner;


public class IlkClass {
	public static void main (String []arg) {
		
int mat,fizik,kimya,turkce,tarih,muzik;

Scanner inp = new Scanner(System.in);


	        
	        System.out.println("mat notunuz:");
	        mat=inp.nextInt();
	       
	        System.out.println("fizik notunuz:");
	        fizik=inp.nextInt();
		       
	        System.out.println("kimya notunuz:");
	        kimya=inp.nextInt();
	       
	        System.out.println("turkce notunuz:");
	        turkce=inp.nextInt();
	       
	        System.out.println("tarih notunuz:");
	        tarih=inp.nextInt();
	       
	        System.out.println("muzik notunuz:");
	        muzik = inp.nextInt();
	       
	        double ortalama = ((mat+fizik+kimya+turkce+tarih+muzik)/6); 
	        
	       
	        		
	        if(ortalama>=60){
	            System.out.println("ortalama ="+ortalama+" GEÇTİNİZ.");
	        }
	        else{
	            System.out.println("ortalama ="+ortalama+" KALDINIZ.");
	        }
	}
	    
	}