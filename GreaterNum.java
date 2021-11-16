import java.util.*;
class GreaterNum

 
{ 
  public static void main (String args[])
	{
         int a,b,c;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter value for a");
		 a=sc.nextInt();
		 System.out.println("Enter value for b");
		 b=sc.nextInt();
		 System.out.println("Enter value for c");
		 c=sc.nextInt();
		 
		 if(a>b)
		  { 
		     if(a>c)
			 { 
			   System.out.println("Greater number"+a);
			 }
			 else
			 { 
			  System.out.println("Greater number is"+c);
			 }
		  }
		  else
		  { 
		     if(b>c)
			 {
			System.out.println("Greater number is"+b);
		     }
			 else
			 {
			  System.out.println("Greater number is"+c);
			 }
		  }
	}
}
		    
		 
         		 
	   