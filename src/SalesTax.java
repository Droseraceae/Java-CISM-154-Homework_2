
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * Create a program that prompts the user to enter
 * the amount of a purchase. Your program will then display:
 * 
 * The state sales tax amount (6.2%)
 * The county sales tax amount (3%)
 * The total sales tax (The sum of the state and county sales taxes)
 * The total of the sale (The sum of the purchase price and total sales tax)
 * 
 * All dollar amounts should be formatted to 2 decimal places.
 * 
 * @author Josh Alcoba
 * 
 */
public class SalesTax {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		double purchaseDouble;
		double stateTax;
		double countyTax;
		double totalTax;
		double totalSale;
		
		purchaseDouble = Double.parseDouble(JOptionPane.showInputDialog("Please enter purchase amount: "));
		
		stateTax = purchaseDouble * 0.062;
		countyTax = purchaseDouble * 0.03;
		totalTax = stateTax + countyTax;
		totalSale = purchaseDouble + totalTax;
		
		System.out.printf("The state sales tax is $%.2f\n", stateTax);
		System.out.printf("The county sales tax is $%.2f\n", countyTax);
		System.out.printf("The total sales tax is $%.2f\n", totalTax);
		System.out.printf("The total sale is $%.2f\n", totalSale);
		
		/*** SAMPLE INPUT/OUTPUT ***
		 * Please enter the purchase amount: 120
		 * 
		 * The state sales tax is $7.44
		 * The county sales tax is $3.60
		 * The total sales tax is $11.04
		 * The total sale is $131.04
		 */
	}

}
