import java.text.DecimalFormat;
import java.util.Scanner;

/**************************************************************/
/*Program:  Change                                            */
/*CSCV 335                                                    */
/*Nicholas Zarek                                              */
/*03/17/2019                                                  */
/*This program provides the change for a value entered by user*/
/**************************************************************/
public class change {

	public static void calcMoney(double money) //Method to process user entry
	{
		
		int twentyBill = 0;
		int tenBill = 0;
		int fiveBill = 0;
		int oneBill = 0;
		int quarter = 0;
		int dime = 0;
		int nickel = 0;
		int penny = 0;
		
		DecimalFormat df = new DecimalFormat("#.##");
		if (money < 0) //Statement to find if user entry is negative value and to exit program if so
		{
			System.out.print("Goodbye!");
			System.exit(0);
		}
		
		while (money >= 0.00) //Process to determine how many of each unit and decrementing total amount as it's processed
		{
			
				while (money >= 20.00) {
					money -= 20.00;
					++twentyBill;
					money = Double.valueOf(df.format(money)); //Decimal formatting to avoid trailing numbers in the double when performing arithmetic 
				} 
				 while (money >= 10.00) {
					 money -= 10.00;
					++tenBill;
					money = Double.valueOf(df.format(money));
				}
				while (money >= 5.00) {
					money -= 5.00;
					++fiveBill;
					money = Double.valueOf(df.format(money));
				}	
				 while (money >= 1.00) {
					 money -= 1.00;
					++oneBill;
					money = Double.valueOf(df.format(money));
				}
				 while (money >= 0.25) {
					 money -= 0.25;
					++quarter;
					money = Double.valueOf(df.format(money));
				}	
				 while (money >= 0.1) {
					 money -= 0.1;
					++dime;
					money = Double.valueOf(df.format(money));
				}	
				 while (money >= 0.05) {
					 money -= 0.05;
					++nickel;
					money = Double.valueOf(df.format(money));
				}	
				 while (money >= 0.00) {
					 money -= 0.01;
					++penny;
				 }
		}
		System.out.println("I will give you: " + twentyBill + " 20$ bill, " + tenBill + " $10 bill, " + fiveBill + " $5 bill, " + oneBill + " $1 bill, " + quarter + " quarters, " + dime + " dimes, " + nickel + " nickels and " + penny + " pennies.");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in); //Scanner to read user input
		
		double moneyEntered = 0.00;
		
		System.out.print("How much money do you want? ");
		moneyEntered = scnr.nextDouble();
		
		calcMoney(moneyEntered); //Method to process money entered by user

		while (moneyEntered >= 0.0) //Loop to prompt user to continue to enter an amount 
		{
			System.out.println("Do you want to ask me for another amount? ");
			moneyEntered = scnr.nextDouble();
	
			calcMoney(moneyEntered);
		}

		scnr.close();
	}

}
