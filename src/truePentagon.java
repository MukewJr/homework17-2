public class truePentagon extends AbstractShape{
    int side;

    public truePentagon(int side) {
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return 5*side;
    }
}
