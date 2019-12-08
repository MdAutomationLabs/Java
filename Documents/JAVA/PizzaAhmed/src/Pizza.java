/** This is pizza class 
 * @author MD AHMED
 *
 */
public class Pizza { 
	// Md Ahmed
	private String topping;
	private String pizzaSize;
	private double price;
	private int nextOrderNumber;
	private static int orderNumber = 1001;

	
	public Pizza(String topping, String size, double price) {
		setTopping(topping);
		pizzaSize = size;
		setPrice(price);
		if (getSize() == "small" || getSize() == "medium" || getSize() == "large" || getSize() == "extra large"){
			this.pizzaSize = size;
		}else{
			this.pizzaSize = "error";
				throw new  IllegalArgumentException("Pizza is not created");
	}
		 orderNumber++;
		 nextOrderNumber = orderNumber;
	}

	public int getNextOrderNumber() {
		return nextOrderNumber;
	}

	public String getTopping() {
		return topping;
	}

	public void setTopping(String topping) {
		this.topping = topping;
	}

	public String getSize() {
		pizzaSize.toLowerCase();
		return pizzaSize;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	public static  Pizza quickOrder(String topping){
		Pizza p = new Pizza (topping, "large", 9.99);
		return p;	
	}
	public String repeatOrder() {
		String order = "Order number: " +this.getNextOrderNumber()+", Topping: " +this.getTopping() + ", Size: "
				+ this.getSize() + ", price: $" + this.getPrice()+".";
		return order;

	}

	public String toString() {
		return "[topping=" + topping + ", pizzaSize=" + pizzaSize
				+ ", price=" + price + ", nextOrderNumber=" + nextOrderNumber
				+ "]";
	}
}
