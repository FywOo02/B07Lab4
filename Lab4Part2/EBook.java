public class EBook extends Book {
	
	public EBook(String isbn, String title) {
		super(isbn, title, 0, 0, 0);
	}


	// following code is not needed
	/*
	@Override
	public double getLength() {
		throw new RuntimeException();
	}

	public double getHeight() {
		throw new RuntimeException();
	}

	public double getWidth() {
		throw new RuntimeException();
	}

	 */

}
