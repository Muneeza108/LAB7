/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7task3;

/**
 *
 * @author natas
 */
public class BadRectangle {

    protected int width;
    protected int height;

    public void setDimensions(int w, int h) {
        width = w;
        height = h;
    }

    public int getArea() {
        return width * height;
    }
}