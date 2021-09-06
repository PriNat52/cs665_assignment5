package edu.bu.met.cs665;

public class Bid {

	private String product;
	private String bid;
	
	public Bid(String product, String bid) {
		this.setProduct(product);
		this.setBid(bid);
	}
	public String getBid() {
		return bid;
	}
	public void setBid(String bid) {
		this.bid = bid;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	
	public String toString() {
		return "Product Name: "+product+" Bid: "+bid;
		
	}
}
