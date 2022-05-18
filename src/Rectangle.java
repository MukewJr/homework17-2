public class Rectangle extends AbstractShape {
    int width;
    int length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double getPerimeter() {
        return 2*(width+length);
    }
}
