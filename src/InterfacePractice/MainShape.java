package InterfacePractice;

public class MainShape {

    public static void main(String[] args) {

        Shapes shape = new Circle();

        shape.draw();
        shape.shapeArea();

        System.out.println();

        Shapes shape1 = new Square();

        shape1.draw();
        shape1.shapeArea();

    }

}
