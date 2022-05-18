public class Square extends AbstractShape{
    int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return 4*side;
    }
}
