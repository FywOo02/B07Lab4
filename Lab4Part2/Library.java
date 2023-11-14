import java.util.HashSet;

public class Library extends Store<Book> {
	@Override
	public void deliver(Book book, Customer customer) {
		if(itemExists(book)){
			System.out.println("Delivering " + book);
			System.out.println("Delivery service: Books Express");
			System.out.println("Box size: " + determineBoxSize(book));
			System.out.println("Address: " + customer.getPostalCode());
			removeItem(book);
		}
	}
}
