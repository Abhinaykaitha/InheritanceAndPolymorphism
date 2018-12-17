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
public class RegularPolygon extends Polygon{
    private double length;
/**
 * constructor
 * @param name {String} name of the polygon
 * @param noSides {int} number of sides of polygon
 * @param length {double} length of the side of the polygon
 */
    public RegularPolygon(String name, int noSides,double length) {
        super(name,noSides);
        this.length=length;
    }
    //getter methods
/**
 * 
 * @return length of the side of the polygon
 */
    public double getLength() {
        return length;
    }
    //end of getter methods
    @Override
    /**
     * returns Area of the regular polygon
     * Area=(1/4)*(no of sides*(length<sup>2</sup>)(cot(pi/no of sides))
     */
    public double getArea()
    {
     double A;
     A=0.25 * super.getNoSides()*getLength()*getLength()*(1/Math.tan(Math.PI/super.getNoSides()));
     return A;
    }
    @Override
    /**
     * returns  perimeter of the regular polygon
     * Perimeter=(no of sides)*(length )
     */
    public double getPerimeter()
    {
        double P;
        P=super.getNoSides()*length;
        return P;
    }
    @Override
    /**
     * returns the internal angle of the regular polygon
     * Internal Angle=(180/no of sides)(no of sides-2)
     */
    public double getInternalAngle()
    {
        double t;
        t=(180/super.getNoSides())*(super.getNoSides()-2);
        return t;
    }
    /**
     * 
     * @return the incircle radius of the regular polygon
     * Incircle radius=(length/2)*(cot(pi/no of sides))
     */
    public double getInCircleRadius()
    {
        double r;
        r=(length/2)*(1/Math.tan(Math.PI/super.getNoSides()));
        return r;
    }
    /**
     * 
     * @return the circumcircle radius
     * Circumcircle Radius=(length/2)(cosec(pi/no of sides))
     */
    public double getCircumCircleRadius()
    {
        double R;
        R=(length/2) * (1/Math.sin(Math.PI/super.getNoSides()));
        return R;
    }
    @Override
    /**
     * returns the details of the regular polygon
     */
    public String toString()
    {
        return super.toString()+"\n\t"
                +"Length of side: "+length+"cms"+"\n\t"
                +"Internal angle: "+String.format("%.2f",getInternalAngle())+"\u00b0"+"\n\t"
                +"Circumcircle radius: "+String.format("%.2f",getCircumCircleRadius())+"cms"+"\n\t"
                +"Incircle radius: "+String.format("%.2f",getInCircleRadius())+"cms"+"\n\t"
                +"Area: "+String.format("%.2f",getArea())+"cm"+"\u00b2"+"\n\t"
                +"Perimeter: "+String.format("%.2f",getPerimeter())+"cms";
                
                
    }
    
}
