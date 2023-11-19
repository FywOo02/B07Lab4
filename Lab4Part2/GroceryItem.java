public class GroceryItem extends Item implements PhysicItemCal{
	double length;
	double width;
	double height;
	public GroceryItem(String id, String name, double length, double width, double height) {
		super(id, name);
		this.length = length;
		this.width = width;
		this.height = height;
	}

	@Override
	public double getLength() {
		return length;
	}

	@Override
	public double getHeight() {
		return height;
	}
	@Override
	public double getWidth() {
		return width;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof GroceryItem))
			return false;
		GroceryItem other = (GroceryItem) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
