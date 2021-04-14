package Q_11_18_04_April;

import java.util.Scanner;

public class IndirimlerYuzdelik {

	public static void main(String[] args) {
	/*	Verilen bir fiyat icin 
		%10 , %20, %25 indirim 
		yapan uc method olusturun.
		- Method’da indirim 
		uygulayip fiyati main 
		method’da yazdirin
		- Method’lari arka 
		arkaya cagirip dogru 
		calistiklarini kontrol edin
*/
		
		
		
		
		indirimYuzdeOn();
		indirimYuzdeYirmi();
		indirimYuzdeYirmiBes();
	}

	private static double indirimYuzdeYirmiBes() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a price to make a %25 discount");
		
		double price=scan.nextDouble();
		
		double percentage, discount, newPrice; 
		discount=25;
		percentage= 100-discount;
		
		newPrice=(price*percentage)/100;
		System.out.println("The %25 discounted price is: "+ newPrice);
		
		System.out.println();
		
		
		
		
		return 25;
	}

	private static double indirimYuzdeYirmi() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a price to make a %20 discount");
		
		double price=scan.nextDouble();
		
		double percentage, discount, newPrice; 
		discount=20;
		percentage=100-discount;
		
		newPrice= (price*percentage)/100;
		System.out.println("The %20 discounted price is: "+ newPrice);
		
		System.out.println();
		
		
		return 20;
	}

	private static double indirimYuzdeOn() {
       Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a price to make a %10 discount");
		
		double price=scan.nextDouble();
	    double discount=10;
	    double percentage;
	    double newPrice;
	
	    percentage = 100-discount;
	    
	newPrice= (percentage*price)/100;
	System.out.println("The %10 discounted price is: "+ newPrice);
	System.out.println();
	return 10;
	}

}
