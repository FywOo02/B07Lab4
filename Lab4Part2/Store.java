import java.util.HashSet;

/**
 * @Author: Cho
 * @Date: 2023-11-13 9:00 p.m.
 */
public abstract class Store<T extends Item> {
    HashSet<T> items;

    public Store() {
        items = new HashSet<T>();
    }

    public void addItem(T item) {items.add(item);
    }

    public void removeItem(T item) {
        items.remove(item);
    }

    public boolean itemExists(T item) {
        return items.contains(item);
    }

    public abstract String determineBoxSize(T item);

    public abstract void deliver(T item, Customer customer);
}