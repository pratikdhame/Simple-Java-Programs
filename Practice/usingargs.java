class usingargs
{
 public static void main(String[] args)
 {
  int a, b, c, d;
  a=Integer.parseInt(args[0]);
    b=Integer.parseInt(args[1]);
	  c=Integer.parseInt(args[2]);
	    d=Integer.parseInt(args[3]);
 
  int result= (a+b+c+d);
  int average = (result/4);
  System.out.println("Addition of the number is = "+result);
  System.out.println("Average of the number is = "+average);
  }
 }