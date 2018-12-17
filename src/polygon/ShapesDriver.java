/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polygon;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Kaitha, Abhinay Reddy;
 */
public class ShapesDriver {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        ArrayList<Polygon> polygons=new ArrayList<Polygon>();
        Scanner scan=new Scanner(new File("shapes.txt"));
       Cube cube=null;
       RegularPolygon rp=null;
       Tetrahedron t=null;
       EquilateralTriangle triangle=null;
        Square s=null;
       while(scan.hasNext())
        {
             String shape=scan.next();
            if(shape.equals("cube")||shape.equals("Cube"))
            {
                cube=new Cube(scan.nextDouble());
                polygons.add(cube);
                scan.nextLine();
            }
            if(shape.equals("pentagon")|| shape.equals("Pentagon"))
            {
                 rp=new RegularPolygon(shape,scan.nextInt(),scan.nextInt());
                polygons.add(rp);
                scan.nextLine();
            }
            if(shape.equals("tetrahedron")||shape.equals("Tetrahedron"))
            {
                 t=new Tetrahedron(scan.nextDouble());
                polygons.add(t);
                scan.nextLine();
            }
            if(shape.equals("triangle")|| shape.equals("Triangle"))
            {
                triangle=new EquilateralTriangle(scan.nextDouble());
                polygons.add(triangle);
                scan.nextLine();
            }
            if(shape.equals("square")||shape.equals("Square"))
            {
                s=new Square(scan.nextDouble());
                polygons.add(s);
                scan.nextLine();
            }
            if(shape.equals("hexagon")||shape.equals("Hexagon"))
            {
                rp=new RegularPolygon(shape,scan.nextInt(),scan.nextInt());
                polygons.add(rp);
                scan.nextLine();
            }
            
            
        }
        for(Polygon p:polygons )
        {
            System.out.println("*****************************************");
            System.out.println(p);
        }
        double max=0;
        double maxp=0;
        String name="";
        for(Polygon p:polygons)
        {
            if(max<p.getArea())
            {
                max=p.getArea();
                name=p.getName();
            }
        }
        System.out.println("*****************************************");
        System.out.println("The polygon with largest area is "+ name+" with area of "+String.format("%.2f",max)+"cm\u00b2");
        
        for(Polygon p:polygons)
        {
            if(maxp<p.getPerimeter())
            {
                maxp=p.getPerimeter();
                name=p.getName();
            }
        }
        System.out.println("The polygon with largest perimeter is "+ name +"  with perimeter of "+String.format("%.2f",maxp)+"cms");
        System.out.println("*****************************************");
        
        System.out.println("Surface area to Volume ratio of given solids are:");
        System.out.println("Cube:"+"\n\tSurface area: "+ String.format("%.2f",cube.getArea())+"cm\u00b2");
        System.out.println("\tVolume: "+ String.format("%.2f",cube.getVolume())+"cm\u00b3");
        System.out.println("Tetrahedron:\n\tSurface area: "+ String.format("%.2f",t.getArea())+"cm\u00b2");
        System.out.println("\tVolume: "+ String.format("%.2f",t.getVolume())+"cm\u00b3");
        System.out.println("******************************************");
        System.out.println("We used Polymorpic substitution while creating objects for equilateral triangle");
        System.out.println("******************************************");
        System.out.println("We used late binding polymorphism while creating cube, tetrahedron,pentagon,hexagon and triangle objects which invokes a method at run time");
        System.out.println("***************************************** ");
       
    }
    
}
