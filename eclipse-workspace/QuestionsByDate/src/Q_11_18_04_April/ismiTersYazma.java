package Q_11_18_04_April;

import java.util.Scanner;

public class ismiTersYazma {

	public static void main(String[] args) {

Scanner input= new Scanner(System.in);
System.out.println("Please enter a name");

String name=input.next();
String reverse="";
for (int i=name.length()-1; i>=0; i--) {
	reverse+=name.charAt(i);
	
}
System.out.println("Hello "+reverse);
	}

}
