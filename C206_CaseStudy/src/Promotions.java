
public class Promotions{
	private String name;
	private int price;
	private String date;

	public Promotions(String name, int price, String date) {
		this.name = name;
		this.price = price;
		this.date = date;
	}
	
	public String getName() {
		return name;
	}

	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString(){
		String info = "";
		// Write your codes here
		return String.format("%-63s %-20d", info);
		
	}
}

