package edu.bu.met.cs665;

public class AuctionSystem {

	private String product;
	private String cost;
	
	public AuctionSystem(String product, String cost) {
		this.setProduct(product);
		this.setCost(cost);
	}
	
	
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	public String toString() {
		return "Product: "+product+" Cost: "+cost;
		
	}
}
