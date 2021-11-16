// write java program to calculate square of input number
import java.io.*;
class Square
{
  public static void main (String args[]) throws IOException
    {
	   int no,square;
	   
	   BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	   
	   System.out.println(" Enter Number to Find it's Square :");
	   no=Integer.parseInt(br.readLine());
	   
	  square= (no*no);
	  System.out.println(" Sqaure Of The Given Number "+square);
	}
}
	  
	   