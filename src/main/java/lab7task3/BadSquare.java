/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7task3;

/**
 *
 * @author natas
 */
public class BadSquare extends BadRectangle {

    @Override
    public void setDimensions(int w, int h) {
        if (w != h) {
            throw new IllegalArgumentException(
                    "Square sides must be equal!");
        }

        width = w;
        height = h;
    }
}
