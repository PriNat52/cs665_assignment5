package edu.bu.met.cs665;

public class Buyer implements Observer{

	private int id;
	private String buyername;
	private Bid bid;
	
	public Buyer(int id, String name) {
		this.setBuyername(name);
		this.setId(id);
	}
	@Override
	public void updateDriver(Bid bidrequest) {
		// TODO Auto-generated method stub
		this.setBid(bidrequest);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBuyername() {
		return buyername;
	}
	public void setBuyername(String buyername) {
		this.buyername = buyername;
	}
	public Bid getBid() {
		return bid;
	}
	public Bid getBid(Bid bid) {
		this.setBid(bid);
		return bid;
	}
	
	public void setBid(Bid bid) {
		this.bid = bid;
	}
	
	public Bid getDelivery(Bid deliveryrequest) {

		return deliveryrequest;	
	}
	
	public String toString() {
		return "ID: "+id+" Name: "+buyername;
	}

}
