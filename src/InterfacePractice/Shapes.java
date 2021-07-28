package InterfacePractice;

interface Shapes {

    default void shapeColor(){

        System.out.println("Shape color is white");

    }

    void draw();

    void shapeArea();

}
