package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PriceErrorChecker {

	// Method to count price errors between the correct prices and sold prices
	public static int countPriceErrors(String[] products, double[] productPrices, String[] productSold,
			double[] soldPrice) {
		Map<String, Double> productPriceMap = new HashMap<>();

		// Fill the map with products and their correct prices
		for (int i = 0; i < products.length; i++) {
			productPriceMap.put(products[i], productPrices[i]);
		}

		int errorCount = 0;

		// Compare each sold product's price with the correct price
		for (int i = 0; i < productSold.length; i++) {
			String soldProduct = productSold[i];

			// Ensure the sold product exists in the map to avoid exceptions
			if (productPriceMap.containsKey(soldProduct)) {
				double correctPrice = productPriceMap.get(soldProduct);
				if (correctPrice != soldPrice[i]) {
					errorCount++; // Increment error count if there's a mismatch
				}
			}
		}

		return errorCount;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Input for products and their correct prices
		int n = sc.nextInt(); // Number of products
		String[] products = new String[n];
		double[] productPrices = new double[n];

		for (int i = 0; i < n; i++) {
			products[i] = sc.next(); // Read product name
		}

		for (int i = 0; i < n; i++) {
			productPrices[i] = sc.nextDouble(); // Read product price
		}

		// Input for sold products and their sold prices
		int m = sc.nextInt(); // Number of sold products
		String[] productSold = new String[m];
		double[] soldPrice = new double[m];

		for (int i = 0; i < m; i++) {
			productSold[i] = sc.next(); // Read sold product name
		}

		for (int i = 0; i < m; i++) {
			soldPrice[i] = sc.nextDouble(); // Read sold product price
		}

		// Calculate the number of pricing errors
		int errors = countPriceErrors(products, productPrices, productSold, soldPrice);
		System.out.println(errors); // Output the result
	}
}
