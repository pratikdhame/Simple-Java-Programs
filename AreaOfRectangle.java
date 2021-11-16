import java.util.*;
class AreaOfRectangle
{
  public static void main(String args[])
   {
      int length,breadth,area;
	   
	  Scanner sc =  new Scanner(System.in);
	  
	  System.out.println("Enter length of rectangle  :");
	  length=sc.nextInt();
	 
	  System.out.println("Enter breadth of triangle");
	  breadth=sc.nextInt();
	 
	  area=(length*breadth);
	  System.out.println(" Area Of Rectangle is : "+area);
   }
 }
	  