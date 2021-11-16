class Result
{
     public static void main( String args[] )
	   {
	      int phy,chem,maths,java;
		  int total;
		  int avg;
		  phy=Integer.parseInt(args[0]);
		    chem=Integer.parseInt(args[1]);
			  maths=Integer.parseInt(args[2]);
			    java=Integer.parseInt(args[3]);
		total=(phy+chem+maths+java);
		avg  =total/4;
		
		System.out.println("Total subject Marks="+total);
		System.out.println("Average Marks="+avg);
		}
}
		