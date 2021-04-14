package Q_11_18_04_April;

import java.util.Scanner;

public class Yuzdelik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter a price to make a discount");
		
		double price=scan.nextDouble();
	    double discount=10;
	    double percentage;
	    double newPrice;
	
	    percentage = 100-discount;
	newPrice= (percentage*price)/100;
	System.out.println(newPrice);
	}

}
