public class Circle extends AbstractShape{
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return Math.PI*2*radius;
    }
}
