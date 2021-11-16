// Find volume of cylinder
import java.util.*;
class VolumeOfCylinder
{  
  public static void main( String args[])
   {
     int radius,height;
	 float volume;
	 Scanner sc= new Scanner (System.in);
	 
	 System.out.println(" Enter Radius of Cylinder :");
	 radius=sc.nextInt();
	 System.out.println(" Enter height of Cylinder :");
	 height=sc.nextInt();
	 
	 volume=(3.14f*radius*radius*height);
	 
	 System.out.println(" Volume of cylinder :"+volume);
	}
}
	 