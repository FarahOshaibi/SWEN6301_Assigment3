/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigment3;

//import java.awt.Shape;

/**
 * The subclass Rectangle needs to implement all the abstract methods in Shape
 */
 // using keyword "implements" instead of "extends"
public class Rectangle implements Shape {
    // Private member variables
   private int length, width;
    
    //Stamp coupling :occurse whenever one of your app class is declared as the type of method argument
   public void Stamp(Shape Rec){
        System.out.println("Rectangle shape");

    }
 
   /** Constructs a Rectangle instance with the given length and width */
   public Rectangle(int length, int width) {
      this.length = length;
      this.width = width;
   }

   /** Returns a self-descriptive string */
   @Override
   public String toString() {
      return "Rectangle[length=" + length + ",width=" + width + "]";
   }

   // Need to implement all the abstract methods defined in the interface
   /** Returns the area of this rectangle */
   //polymorphasim 
   @Override
   public double getArea() {
      return length * width;
      
   }
  
  
   }   

