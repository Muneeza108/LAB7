/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7task3;

/**
 *
 * @author natas
 */
public class LSPDemo {

    public static void main(String[] args) {

        BadRectangle shape = new BadSquare();

        shape.setDimensions(5, 10);

        System.out.println("Area: " + shape.getArea());
    }
}