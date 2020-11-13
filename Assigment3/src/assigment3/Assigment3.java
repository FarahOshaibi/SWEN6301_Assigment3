/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigment3;
/**
 *
 * @author Farah Oshaibi
 */
public class Assigment3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        Shape Rectangle1 = new Rectangle(5, 10);  // upcast
        System.out.println(Rectangle1);
      //Rectangle[length=1,width=2]
      System.out.println("Area is " + Rectangle1.getArea());//Data Coupling occurse when calls method from anthor class
      //Area is 50.0

      Shape Triangle1 = new Triangle(5, 15);  // upcast
      System.out.println(Triangle1);
      //Triangle[base=3,height=4]
      System.out.println("Area is " + Triangle1.getArea());//Data Coupling
      //Area is 37.5
    }
    
}
