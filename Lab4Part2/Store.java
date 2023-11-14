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

    public String determineBoxSize(T item) {
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

    public abstract void deliver(T item, Customer customer);
}