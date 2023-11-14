import java.util.HashSet;

public class GroceryStore extends Store<GroceryItem> {

	@Override
	public String determineBoxSize(GroceryItem item) {
		double length = item.getLength();
		double width = item.getWidth();
		double height = item.getHeight();
		double max = length;
		if(max < width)
			max = width;
		if(max < height)
			max = height;
		if(max < 10)
			return "small";
		else if(max < 20)
			return "medium";
		else if(max < 30)
			return "large";
		else
			return "x-large";
	}

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
