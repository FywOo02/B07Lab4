/**
 * @Author: Cho
 * @Date: 2023-11-13 9:01 p.m.
 */
public class Item {
    String id;
    String name;

    public Item(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return name;
    }
}
