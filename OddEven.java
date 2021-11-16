import java.util.*;
class OddEven
{
     public static void main(String args[])
    { 
	 int no;
	 Scanner sc=new Scanner (System.in);
	 System.out.println("Enter number to find odd or even");
	 no=sc.nextInt();
	 
	 if(no%2==0)
	   {
	     System.out.println("Given Number is Even");
	   }
	   else
	   {
	     System.out.println("Given number is Odd");
	   }
	 }
}