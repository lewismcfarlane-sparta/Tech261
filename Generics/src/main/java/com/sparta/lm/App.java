package com.sparta.lm;

public class App {
    public static void main(String[] args) {
        IntegerRectangle integerRectangle = new IntegerRectangle(2, 4);
        DoubleRectangle doublerectangle = new DoubleRectangle(2.0, 4.0);
        System.out.printf("Integer Rectangle Area: %d\n", integerRectangle.getHeight() * integerRectangle.getWidth());
        System.out.printf("Double Rectangle Area %f\n", doublerectangle.getHeight() * doublerectangle.getWidth());

        ObjectRectangle objectRectangle1 = new ObjectRectangle(2, 4);
        ObjectRectangle objectRectangle2 = new ObjectRectangle(2.0, 4.0);

        System.out.printf("Object Integer Rectangle Area: %d\n", (Integer)objectRectangle1.getHeight() * (Integer)objectRectangle1.getHeight());
        System.out.printf("Object Double Rectangle Area: %f\n", (Double)objectRectangle2.getHeight() * (Double)objectRectangle2.getHeight());


        GenericRectangle<Integer> integerGenericRectangle = new GenericRectangle<>(2, 4);

        GenericRectangle<?> boundGenericRectangle = new GenericRectangle<>(2, 4);

        GenericRectangle<? extends Number> extendsGenericRectangle = new GenericRectangle<>(2, 4); // You can pass number or any of its subclasses here
        GenericRectangle<? super Number> superGenericRectangle = new GenericRectangle<>(2, 4); //

        GenericRectangle<Double> doubleGenericRectangle = new GenericRectangle<>(2.0, 4.0);

        System.out.printf("Generic Integer Rectangle Area: %d\n", integerGenericRectangle.getHeight() * integerGenericRectangle.getWidth());
        System.out.printf("Generic Double Rectangle Area: %f\n", doubleGenericRectangle.getHeight() * doubleGenericRectangle.getWidth());



    }

}
