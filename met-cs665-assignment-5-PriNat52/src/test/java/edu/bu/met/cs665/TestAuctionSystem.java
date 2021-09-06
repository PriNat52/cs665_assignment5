package edu.bu.met.cs665;

import org.junit.Test;

//Create one object of "AuctionSystem", "Seller", "Product" , one "Bid"
//Create at least two "Buyer"s, and create a "Bid" on a product for one of the buyer and inform other buyers.
public class TestAuctionSystem {
	
	AuctionSystem system = new AuctionSystem("Sofa", "$10");
	Seller seller = new Seller("Raz", "sofa");
	Product product = new Product("sofa");
	
	Buyer buyer1 = new Buyer(1, "Mike");
	Buyer buyer2 = new Buyer(2,"Lou");
	
	@Test
	public void testFlowerShop() {
		
		product.registerBuyer(buyer1);
		product.registerBuyer(buyer2);
		
		Bid request = new Bid("Sofa", "Bidder_1");
		product.setBid(request);
		product.bidding(request);

	}
	
}
