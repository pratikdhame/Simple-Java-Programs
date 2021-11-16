import java.util.*;



class circle
{
  public static void main ( String args[] )
    {
	   int radius;
	  
	   float PI=3.14f,area;
	   Scanner sc= new Scanner(System.in);
	   System.out.println("Enter Radius Of Circle :");
	   radius=sc.nextInt();
	   
	   area=(PI*radius*radius);
	   System.out.println("area of circle ="+area);
	 }
}