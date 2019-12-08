
public class PizzaTesterAhmed implements pizzaConstants{

	public static void main(String[] args) {
		// Md Ahmed
		System.out.println("Welcome to "+COMPANY);
		System.out.println(getSpecial());
		Pizza mikePizza = Pizza.quickOrder("mushroom");
       Pizza myPizza = new Pizza("mashroom","large",9.99);
       Pizza yourPizza = new Pizza("pepperoni","extra large",13.99);
     //  Pizza thirdPizza = new Pizza("pepperoni","extra small",7.99);
       Order kelli = new Order();
       kelli.addToOrder(myPizza);
       kelli.addToOrder(yourPizza);
       System.out.println(kelli.gettotalPrice());
      // System.out.println("My pizza " +myPizza );
       System.out.println("Pizza 1 info: "+myPizza.repeatOrder());
       //System.out.println("Your pizza " +yourPizza );
       System.out.println("Pizza 2 info: "+yourPizza.repeatOrder());
      // System.out.println("Third pizza " +thirdPizza );
      //System.out.println(thirdPizza.repeatOrder());
       System.out.println( mikePizza.repeatOrder());
	}
	

}
