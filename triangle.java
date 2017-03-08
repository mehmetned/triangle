public class HelloWorld{  // arguments are passed using the text field below this editor  
  public static void main(String[] args)  {    
    Triangle triangle = new Triangle(3,3,7);    
    System.out.print(triangle.getType());  
  }
}// you can add other public classes to this editor in any order
public class Triangle{  
  private int firstSide;  
  private int secondSide;  
  private int thirdSide;      
  public Triangle()  {  
  }    
  public Triangle(int a,int b,int c)  {    
    firstSide = a;    
    secondSide = b;    
    thirdSide = c;  
  }      
  public void setFirstSide(int lenght)  {   
    firstSide = lenght;  
  }    
  public void setSecondSide(int lenght)  {    
    secondSide = lenght;  
  }    
  public void setThirdSide(int lenght)  {   
    thirdSide = lenght;  
  }  
  public String getType()  {    
    if(firstSide == secondSide && thirdSide == secondSide )     
      return "Equilateral";    
    else if(firstSide == secondSide || thirdSide == secondSide || firstSide == thirdSide)      
      return "Isosceles";    
    else       
      return "Scalene";  
  }    
}
