/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polygon;

/**
 *
 * @author Kaitha, Abhinay Reddy;
 */
public class Square extends RegularPolygon {
/**
 * constructor-one argument constructor
 * @param length length of the side of the square
 */
    public Square(double length) {
        super("Square", 4, length);
    }
/**
 * constructor-two argument constructor
 * @param name name of the polygon
 * @param length length of the side of square
 */
    public Square(String name, double length) {
        super(name, 4, length);
    }

}
