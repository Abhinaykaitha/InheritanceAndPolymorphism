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
public class EquilateralTriangle extends RegularPolygon{
/**
 * constructor-one argument constructor
 * @param length {double} length of the side of equilateral triangle
 */
    public EquilateralTriangle( double length) {
        super("Equilateral Triangle",3, length);
    }
/**
 * constructor
 * @param name {string} name of the polygon
 * @param length {double} length of the side of the equilateral triangle
 */
    public EquilateralTriangle(String name,double length) {
        super(name,3, length);
    }
    /**
     * 
     * @return the height of the equilateral triangle
     * height=square root(3)/2*length of the side of equilateral triangle
     */
    public double getHeight()
    {
        double h;
        h=(Math.sqrt(3)/2)*super.getLength();
        return h;
    }
    @Override
    /**
     * overrides the to string
     * returns the details of the string
     * 
     */
    public String toString()
    {
        return super.toString()+"\n\t"+
                "Height: "+String.format("%.2f",getHeight())+"cms";
    }
    
    
    
    
}
