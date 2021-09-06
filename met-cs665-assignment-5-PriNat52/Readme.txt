Provide a simple implementation for this online auction system. (20 points)
Package edu.bu.met.cs665 contains all files

    Document in your README.md file. Which pattern would you have used for this problem? (3 points)
    For this problem I've created Observer Pattern. 
    Where a first come first serve basis for the buyers to bid the product.
    
    Document in your README.md file. Describe how would your design of the notification system inform buyers about the new bids? (2 points)
    The buyer.java implements Observer interface which updates the bid request. The product.java implements Observable interface contains registers the buyer and notifies them. 
    The other classes for creating an auction system,the seller class and product classes are created. The Bid class plays an important role for creating the bid.