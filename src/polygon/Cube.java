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
public class Cube extends Square{
/**
 * constructor
 * @param length length of the side of cube
 */
    public Cube(double length) {
        super("Cube",length);
    }
    @Override
    /**
     * overrides the getArea method in the regular polygon class
     */
    public double getArea(){
        double A;
        A=super.getArea()*Solids.CUBE.getnoFaces();
        return A;
    }
    /**
     * 
     * @return the volume of the cube
     * volume=(length)<sup>3</sup>
     */
    public double getVolume(){
        double v;
        v=Math.pow(super.getLength(),3);
        return v;
    }
    
    /**
     * 
     * @return the insphere radius of the cube
     * insphere radius=length/2
     */
     public double getInSphereRadius()
     {
         double r;
         r=super.getLength()/2;
         return r;
     }
     /**
      * 
      * @return the circumsphere radius of the cube
      * circumsphere radius=(squareroot(3)/2)*length of the side of cube
      */
     public double getCircumSphereRadius()
     {
         double R;
         R=(Math.sqrt(3)/2)*super.getLength();
         return R;
     }
    @Override
    /**
     * overrides the toString method
     * returns the details of the cube
     */
     public String toString()
     {
         return super.toString()+"\n\t"+
                 "Insphere radius: "+String.format("%.2f",getInSphereRadius())+"cms"+"\n\t"+
                 "Circumsphere radius: "+String.format("%.2f",getCircumSphereRadius())+"cms"+"\n\t"+
                 "Volume: "+String.format("%.2f",getVolume())+"cm\u00b3";
                 
     }
    
}
