/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7task3;

/**
 *
 * @author natas
 */
public class ShapeDemo {

    public static void main(String[] args) {

        Shape rectangle = new Rectangle(5, 10);
        Shape square = new Square(5);

        System.out.println("Rectangle area: "
                + rectangle.getArea());

        System.out.println("Square area: "
                + square.getArea());
    }
}
