package presentation;

import java.util.Scanner;

public class EasyBankingSystem {
	
		public static void main(String[] args) { //main method
		
		Scanner menu = new Scanner(System.in);
			
			char proceed = 'y';
			
			//while(proceed == 'y')
				System.out.println("|-----------------------------------------------|");
				System.out.println("|***WELCOME TO EASY BANKING MANAGEMENT SYSTEM***|");
				System.out.println("|-----------------------------------------------|");
				System.out.println("1) CREATE A NEW ACCOUNT");
				System.out.println("");
				System.out.println("2) LOGIN WITH EXISTING ACCOUNT");
				System.out.println("");
				System.out.println("3) EXIT");
				System.out.println("");
				System.out.println("***PLEASE MAKE A SELECTION BELOW***");
				
				int selection = menu.nextInt();{
					
					switch(selection) {
						
						case 1:
							System.out.println("***PLEASE INPUT YOUR INFORMATION***");
							System.out.println("");
							System.out.println("First Name: ");
							System.out.println("");
							System.out.println("Last Name: ");
							System.out.println("");
							System.out.println("Billing Address: ");
							System.out.println("");
							System.out.println("Zipcode ");							
							System.out.println("");
							System.out.println("Primary Phone Number ");
						
						case 2:
							System.out.println("***PLEASE INPUT YOUR LOGIN INFO***");
							System.out.println("");
							
							
					}
							
						
				}
				
			
				
		
				

		
			
		menu.close();
		
		
		
	}

}
