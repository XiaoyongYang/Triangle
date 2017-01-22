import java.util.Scanner;

public class Triangle {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  //Input the values for three sides of the triangle.
  System.out.println("Please input the value for the length of the triangle's fisrt side:");  
  float a = sc.nextFloat();
  System.out.println("Please input the value for the length of the triangle's second side:");
  float b = sc.nextFloat();
  System.out.println("Please input the value for the length of the triangle's third side:");
  float c = sc.nextFloat();
  System.out.println("From the view of Side Length, the triangle with the above sides is " + JudgeBySideLength(a, b, c));
  System.out.println("From the view of Angle Size, the triangle with the above sides is " + JudgeByAngleSize(a, b, c));
  //Add the other method to determinate the type of triangle.
 }

//This method judges the type of triangle from the view of each Side Length.
 public static String JudgeBySideLength(float x, float y, float z) {   
  String s = "null";
  if (x > 0 && y > 0 && z > 0) {                 // Each side must have a length value larger than 0.
   if (x + y > z && x + z > y && y + z > x) {    //For any triangle, the length value of the add with any two sides        
	                                             // must be larger than the length value of the third side.
    if (x == y || x == z || y == z) {              

     if (x == y && y == z) {                     //For a equilateral triangle, the length value of all the three sides                                                                   
      s = "an equilateral triangle.";            // must be equal to each other. 
      
     } else {                                    //For a isosceles triangle, the length value of any two sides                                                                                                           
      s = "an isosceles triangle.";              // must be equal to each other. 
     }
    } else {                                                                                                                                               
      s = "a scalene triangle.";                 //A scalene triangle is a triangle that has three unequal sides.
    }                                            //A scalene: no sides are equal and no angles are equal
   } else {
      s = "not a triangle.";
   }

  } else {
      s = "not a triangle.";
  }
  return s;
 }


//This method judges the type of triangle from the view of each Angle Size.
 public static String JudgeByAngleSize(float x, float y, float z) {   
  String s = "null";
  if (x > 0 && y > 0 && z > 0) {                                // Each side must have a length value larger than 0.
   if (x + y > z && x + z > y && y + z > x) {                   //For any triangle, the length value of the add with any two sides  
	                                                            // must be larger than the length value of the third side. 
     
	   if (x*x+y*y==z*z || z*z+y*y==x*x || x*x+z*z==y*y) {        //For a right-angled triangle, the add value of the square with the any two angles 
    	 s = "a right-angled triangle.";                        // must be equal to the value of the third angle. 
     
    
     }else if(x*x+y*y>z*z && z*z+y*y>x*x && x*x+z*z>y*y){       //For a acute-angled triangle, the add value of the square with the any two angles                                                                   
         s = "an acute-angled triangle.";                        // must be larger than the value of the third angle.
     
     } else {                                                   //For a obtuse-angled triangle, the add value of the square with the any two angles                                                                                      
         s = "an obtuse-angled triangle.";                       // must be smaller than the value of the third angle. 
     } 
   } else {
         s = "not a triangle.";
   }

  } else {
         s = "not a triangle.";
  }
  return s;
 }
}

