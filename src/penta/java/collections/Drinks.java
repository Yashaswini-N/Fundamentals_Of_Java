package penta.java.collections;

public class Drinks {
	
	String type;
	String brand;
	double quantity;
	double price;
	public Drinks(String type, String brand, double quantity, double price) {
		super();
		this.type = type;
		this.brand = brand;
		this.quantity = quantity;
		this.price = price;
	}
	
	@Override
	public String toString() {
		
		return "Drinks Type : "+this.type+"\n Brand:"+this.brand+"\n Quantity:"+this.quantity+"\n Price: "+this.price;
	}
  
}
  


