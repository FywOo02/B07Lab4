/**
 * @Author: Cho
 * @Date: 2023-11-14 6:06 p.m.
 */
public class PhysicBook extends Book{
    double length;
    double width;
    double height;
    public PhysicBook(String isbn, String title, double length, double width, double height) {
        super(isbn, title);
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
