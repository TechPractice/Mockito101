package com.abuabdul.practice.mockito.application.ecommerce.flipkart;

import java.util.Scanner;
import java.util.logging.Logger;

import com.abuabdul.practice.mockito.application.ApplicationRunConfig;
import com.abuabdul.practice.mockito.application.ecommerce.OnlineEcommerce;

/**
 * Created by abuabdul on 5/16/2015.
 */

public class FlipkartEcommerce implements OnlineEcommerce, ApplicationRunConfig {

	private final static Logger logger = Logger.getLogger(FlipkartEcommerce.class.getName());

	public void showCatalogOfProducts() {
		System.out.println("Showing flipkart");
	}

	public void viewCartPage() {

	}

	public void displayWishlistProducts() {

	}

	public void purchaseProducts() {

	}

	public void run() {
		logger.info("1. Show Products Catalog");
		logger.info("2. Go to Cart page");
		logger.info("3. Display Wishlist");
		logger.info("4. Exit application");
		Scanner scan = new Scanner(System.in);
		int options = scan.nextInt();
		do {
			switch (options) {
			case 1:
				logger.info("Show catalogs");
				showCatalogOfProducts();
				break;
			case 2:
				logger.info("Go to Cart page");
				viewCartPage();
				break;
			case 3:
				logger.info("View Wishlist");
				displayWishlistProducts();
				break;
			case 4:
				break;
			}
			options = scan.nextInt();
		} while (options != 4);
	}

}
