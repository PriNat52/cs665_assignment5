package edu.bu.met.cs665;

public class Seller {

	private String product;
	private String sellername;
	
	public Seller(String sellername, String product) {
		this.setProduct(product);
		this.setSellername(sellername);
	}
	
	public String getSellername() {
		return sellername;
	}
	public void setSellername(String sellername) {
		this.sellername = sellername;
		
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String toString() {
		return "Seller Name: "+sellername+" Product: "+product;
		
	}
}
