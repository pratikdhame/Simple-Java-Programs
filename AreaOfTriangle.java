// Write a java program to find out area of triangle
import java.io.*;
 class AreaOfTriangle
 {
   public static void main( String args[] )
    {
	   int base,height;
	   float area;
	   
	   BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
	    System.out.println(" Enter the base of Rectangle :");
		base=Integer.parseInt(br.readLine());
		System.out.println(" Enter the height of Rectangle :");
	    height=Integer.parseInt(br.readLine());
		
		area=(0.5f*base*height);
		System.out.println(" Area Of Triangle is : "+area);
    }
}