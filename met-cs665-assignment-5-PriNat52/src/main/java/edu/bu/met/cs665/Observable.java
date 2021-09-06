package edu.bu.met.cs665;

public interface Observable {

	public void registerBuyer(Observer buyer);
	public void notifyDriver();
	
}
