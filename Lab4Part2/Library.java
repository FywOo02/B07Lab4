public class Library extends Store<PhysicBook> {

	public String determineBoxSize(PhysicBook physicBook) {
		double length = physicBook.getLength();
		double width = physicBook.getWidth();
		double height = physicBook.getHeight();
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
	public void deliver(PhysicBook physicbook, Customer customer) {
		if(itemExists(physicbook)){
			System.out.println("Delivering " + physicbook);
			System.out.println("Delivery service: Books Express");
			System.out.println("Box size: " + determineBoxSize(physicbook));
			System.out.println("Address: " + customer.getPostalCode());
			removeItem(physicbook);
		}
	}
}
