package InterfacePractice;

public class Square implements Shapes{

    @Override
    public void draw() {
        System.out.println("Square");
        shapeColor();
    }

    @Override
    public void shapeArea() {
        System.out.println("Area formula is power(n,2)");
    }

}
