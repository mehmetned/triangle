public class TriangleType {
  
  public static void main(String[] args) { 
      System.out.print(getTriangleType(2,2,3333));  // a sample call
  }
  
  // function to return the type of a triangle whose length of the sides passed as inputs.
  static String getTriangleType(int fSide, int sSide, int tSide){
    
    if(fSide <= 0 || sSide <= 0 || tSide <= 0){ // each length must be positive
      return "Each length must be a positive number."; 
    }
    else if(fSide == sSide && tSide == sSide ){ // check if the triangle is an Equilateral 
      return "Triangle is an Equilateral";
    }
    else if(fSide == sSide || tSide == sSide || fSide == tSide){ // check if the triangle is an Isosceles
      return "Triangle is an Isosceles";
    }
    else      // Otherwise, it is a Scalene
      return "Triangle is a Scalene";
  }
}
