class AddFloat
{
  public static void main (  String args [] )
    {
	   float no1,no2,no3,no4,total;
	   no1=Float.parseFloat(args[0]);
	   no2=Float.parseFloat(args[1]);
	   no3=Float.parseFloat(args[2]);
	   no4=Float.parseFloat(args[3]);

	   total=(no1+no2+no3+no4);
	   System.out.println("Total   :"+total);
	}
}