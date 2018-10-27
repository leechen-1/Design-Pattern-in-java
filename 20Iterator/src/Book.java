
public class Book {
	private String ISBN;
	private String name;
	private double price;
	
	public Book(String isbn, String name, double price) {
		ISBN = isbn;
		this.name = name;
		this.price = price;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String isbn) {
		ISBN = isbn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public void display() {
		System.out.println("ISBN=" + ISBN + ",name=" + name + ",price" + price);
	}
	
	
}
