import java.util.HashSet;

public class GroceryStore extends Store<GroceryItem> {
	@Override
	public void deliver(GroceryItem item, Customer customer) {
		if(itemExists(item)){
			System.out.println("Delivering " + item);
			System.out.println("Delivery service: Groceries Express");
			System.out.println("Box size: " + determineBoxSize(item));
			System.out.println("Address: " + customer.getPostalCode());
			removeItem(item);
		}
	}
}
