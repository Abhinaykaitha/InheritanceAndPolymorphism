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
public class Polygon {
    private String name;
     int noSides;
/**
 * constructor
 * @param name {string} name of the polygon
 * @param noSides {int} number of sides
 */
    public Polygon(String name, int noSides) {
        this.name = name;
        this.noSides = noSides;
    }
    //getter methods 
/**
 * 
 * @return name of the polygon{string}
 */
    public String getName() {
        return name;
    }
/**
 * 
 * @return number of sides {int}
 */
    public int getNoSides() {
        return noSides;
    }
    //end of getter methods
    /**
     * 
     * @return Area of the polygon
     */
    public double getArea(){
        return 0.0;
    }
    /**
     * 
     * @return perimeter of the polygon
     */
     public double getPerimeter(){
            return 0.0;
            
        } 
     /**
      * 
      * @return internal angle of the polygon
      */
        public double getInternalAngle() {
            return 0.0;
        }
    @Override
    /**
     * returns the details os the polygon
     */
    public String toString(){
        return "Polygon: "+ name+"\n"+"\t"+"Number of sides: "+getNoSides();
    }
}
