public class Main {
    public static void main(String[] args) {
        AbstractShape triangle=new Triangle(10,11,12);
        triangle.getPerimeter();

        AbstractShape rectangle=new Rectangle(12,13);
        rectangle.getPerimeter();

        AbstractShape square=new Square(25);
        square.getPerimeter();

        AbstractShape pentagon=new truePentagon(9);
        pentagon.getPerimeter();

        AbstractShape circle=new Circle(7);
        circle.getPerimeter();

        AbstractShape[] shapes= {triangle, rectangle,square,pentagon,circle};
        for (AbstractShape shape : shapes) {
            System.out.println(shape.getPerimeter());
        }

        }

        }