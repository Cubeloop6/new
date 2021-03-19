/*Name: Masaru Chida
*Section: CS& 141
* 
* This program calculates the price of three different pizzas. The program gets two user inputs, the tax rate
* and price per square inch. The program calculates the price of three different pizzas and outputs their price
* to the screen.
* 
 * 
 */
package cs141.mxchida;

import java.util.Scanner;

/**
 * @author Masaru Chida
 *
 */
public class Pizza {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	    Scanner scnr = new Scanner(System.in);
	    
	    double priceSquareInch;
	    double tax;
	 
	    System.out.println("What is the tax rate as a floating-point number? ");
	    tax = scnr.nextDouble();
	    System.out.println("What is the price per square inch? ");
	    priceSquareInch = scnr.nextDouble();
	    
	    double priceTenInch = Math.pow(10, 2) * priceSquareInch * (1 + tax / 100);
	    double priceTwelveInch = Math.pow(12, 2) * priceSquareInch * (1 + tax / 100);
	    double priceFourteenInch = Math.pow(14, 2) * priceSquareInch * (1 + tax / 100);
	    	    
	    System.out.printf("Price of the 10 inch pizza is $%.2f\n", priceTenInch);
	    System.out.printf("Price of the 12 inch pizza is $%.2f\n", priceTwelveInch);
	    System.out.printf("Price of the 14 inch pizza is $%.2f\n", priceFourteenInch);
	    
	    scnr.close();
	}

}
