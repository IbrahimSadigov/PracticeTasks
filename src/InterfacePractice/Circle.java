package InterfacePractice;

public class Circle implements Shapes {

    @Override
    public void draw() {
        System.out.println("Circle");
        shapeColor();
    }

    @Override
    public void shapeArea() {
        System.out.println("Area formula is Pi * power(r,2)");
    }


}
