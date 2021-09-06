package edu.bu.met.cs665;

import org.apache.log4j.Logger;
import java.util.ArrayList;

public class Product implements Observable{

private static Logger logger = Logger.getLogger(Product.class);
	
	private ArrayList<Observer> list = new ArrayList<Observer>();
	private Bid bid;
	private String product;
	private int ordercount = 0;
	
	public Product(String name) {
		this.product = name;
		this.ordercount = 0;
	}
	
	public void bidding(Bid request){
		/*assigning the delivery request based on first come first served principles*/
		
		ordercount++;
		logger.error("Order:"+"("+ordercount+") "+"Delivery Request for "+product);
		
		logger.error(request.toString());
		
		if(list.size() == 0) {
			
			logger.error("!!! No Bidder Yet!!!");
			
		}else if(list.size() != 0) {

			Observer a= list.get(0);
			logger.error("*** Delivery Request Taken: "+a);
			list.remove(a);
		}
	}
	
	@Override
	public void registerBuyer(Observer buyer) {
		// TODO Auto-generated method stub
		list.add(buyer);
		logger.error("Registered Driver online: " + buyer.toString());
	}

	@Override
	public void notifyDriver() {
		// TODO Auto-generated method stub
		for(Observer driver : list) 
			driver.updateDriver(bid);
		
		logger.error("{{--"+product+": Product Request Notificaion Sent to all buyers"+"--}}");
	}
	
	public void setBid(Bid request) {
		/*sets the delivery request*/
		this.bid = request;
	}

	public Bid getBid() {
		/*returns the delivery request*/
		return bid;
	}

}
