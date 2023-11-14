public class GroceryItem extends Item {
	double length;
	double width;
	double height;
	public GroceryItem(String id, String name, double length, double width, double height) {
		super(id, name);
		this.length = length;
		this.width = width;
		this.height = height;
	}

	public double getLength() {
		return length;
	}

	public double getHeight() {
		return height;
	}

	public double getWidth() {
		return width;
	}






}
