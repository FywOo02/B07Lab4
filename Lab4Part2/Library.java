import java.util.HashSet;

public class Library{
    HashSet<PhysicBook> books;
    public Library() {
        books = new HashSet<PhysicBook>();
    }
    public void addBook(PhysicBook book) {
        books.add(book);
    }

    public void removeBook(PhysicBook book) {
        books.remove(book);
    }

    public boolean bookExists(PhysicBook book) {
        return books.contains(book);
    }


}
