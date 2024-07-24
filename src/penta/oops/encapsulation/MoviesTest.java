package penta.oops.encapsulation;

class Movies
{
	private String movieName;
	private double price;
	private String movieCategory;
	private String language;
	private int noofTickets;
	private int totalPrice;
	private int availableTickets;
	
	
public void setMovieName (String movieName)
{
	this.movieName = movieName;
}

public void setPrice(double price)
{
	this.price = price;
}
public void setMovieCategory(String movieCategory)
{
	this.movieCategory=movieCategory;

}
public void setLanguage(String language)
{
	this.language = language;
}
public String getMovieName()
{
	return this.movieName;// or return movieName;
	
}
public double getPrice()
{
	return this.price;
	
}
public String getMovieCategory()
{
	return this.movieCategory;
	
}
public String getLanguage()
{
	return this.language;
}

public int getAvailableTickets() {
	return availableTickets;
}

public void setAvailableTickets(int availableTickets) {
	this.availableTickets = availableTickets;
}


public int getNoofTickets() {
	return noofTickets;
}

public void setNoofTickets(int noofTickets) {
	this.noofTickets = noofTickets;
}

public void setTotalPrice(int totalPrice )
{
	this.totalPrice = totalPrice * noofTickets;
}

public double getTotalPrice()
{
	return totalPrice;
	
}
public int getfinalTicketsAvailable() // here we can create our own methods 
{
	return availableTickets - noofTickets;
	
}


}


public class MoviesTest {

	public static void main(String[] args) {
		
		Movies movie1 = new Movies();
		movie1.setMovieName("Despicable 4");
		movie1.setMovieCategory("Cartoon");
		movie1.setLanguage("Spanish");
		movie1.setPrice(300);
		movie1.setNoofTickets(10);
		movie1.setTotalPrice(300);
		movie1.setAvailableTickets(50);
		
		System.out.println("Movie Details");
		System.out.println("Movie Name :"+movie1.getMovieName());
		System.out.println("Movie Category Name :" +movie1.getMovieCategory());
		System.out.println("Movie Language is :"+movie1.getLanguage());
		System.out.println("Movie Price is :"+movie1.getPrice());
		System.out.println("Available Tickets:"+movie1.getAvailableTickets());
		System.out.println("No of Tickets:"+movie1.getNoofTickets());
		
		System.out.println("Total Price:"+movie1.getTotalPrice());
		
		System.out.println("Final Available Tickets:"+movie1.getfinalTicketsAvailable());
//		int tickets_needed;
//		int Total_tickets = 10;
//	    int Available_tickets;
//	    int price = 300;
//	    double Total_price;
//		System.out.println("the Total tickets are:"+Total_tickets);
//		Scanner sc = new Scanner(System.in);
//		System.out.println("The total tickets needed:");
//		tickets_needed = sc.nextInt();
//		Total_price = price * tickets_needed;
//		System.out.println("The total price of the tickets booked are:"+Total_price);
//		Available_tickets = Total_tickets - tickets_needed;
//		System.out.println("The available tickets are:"+Available_tickets);
		
	}
}

