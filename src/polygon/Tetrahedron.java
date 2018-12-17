/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polygon;

import enums.Solids;

/**
 *
 * @author Kaitha, Abhinay Reddy;
 */
public class Tetrahedron extends EquilateralTriangle{
/**
 * constructor -one argument constructor
 * @param length 
 */
    public Tetrahedron(double length) {
        super("Tetrahedron", length);
    }
    @Override
    /**
     * returns the height of the tetrahedron
     * height=square root(6)/3 * length of the side 
     */
    public double getHeight()
    {
        double h;
        h=(Math.sqrt(6)/3)*super.getLength();
        return h;
             
    }
    @Override
    /**
     * overrides the getArea method 
     * 
     */
    public double getArea()
    {
        double a;
        a=super.getArea()*Solids.TETRAHEDRON.getnoFaces();
        return a;
        
    }
    /**
     * 
     * @return the volume of the tetrahedron
     * volume=(length)(length)(length)(square root(2)/12)
     */
    public double getVolume()
    {
        double v;
        v=(Math.sqrt(2)/12)*(Math.pow(super.getLength(),3));
        return v;
    }
    /**
     * 
     * @return the insphere radius of the tetrahedron
     * Insphere radius=(length)*(square root(24))
     */
    public double getInSphereRadius()
    {
        double r;
        r=(super.getLength()/(Math.sqrt(24)));
        return r;
    }
    /**
     * 
     * @return the circumsphere radius of the tetrahedron
     * circumsphere radius=(square root(6)/4) * (length of the side of tetrahedron)
     */
    public double getCircumSphereRadius()
    {
        double r;
        r=(Math.sqrt(6)/4)*super.getLength();
        return r;
        
    }
   @Override
   /**
    * overrides the toString method
    * details of the tetrahedron
    */
    public String toString()
    {
        return super.toString()+"\n\t"+
               "Insphere radius: "+String.format("%.2f",getInSphereRadius())+"cms\n\t"+
                "Circumsphere radius: "+String.format("%.2f",getCircumSphereRadius())+"cms\n\t"+
                "Volume: "+String.format("%.2f",getVolume())+"cm"+"\u00b3 ";
    }
    
}
