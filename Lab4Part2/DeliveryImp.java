import java.util.HashSet;

public class DeliveryImp<T extends PhysicItemCal>{
    HashSet<T> items;
    public DeliveryImp(HashSet<T> items){
        this.items = items;
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

    public void deliver(T item, Customer customer) {
        if(items.contains(item)){
            System.out.println("Delivering " + item);
            System.out.println("Delivery service: " +item.getClass()+"Express");
            System.out.println("Box size: " + determineBoxSize(item));
            System.out.println("Address: " + customer.getPostalCode());
            items.remove(item);
        }
    }
}
