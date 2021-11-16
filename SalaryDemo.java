import java.util.*;

class SalaryDemo
{
   public static void main(String args[])
    {
	    int basic_salary,TA,DA,HRA,gross_salary;
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter you baic salary:");
		
		basic_salary=sc.nextInt();
		TA=(basic_salary*10)/100;
		DA=(basic_salary*5)/100;
		HRA=(basic_salary*15)/100;
		gross_salary=(basic_salary+TA+DA+HRA);
		System.out.println("*****************************************************");
		System.out.println("**********    Gross Salary                ***********");
		System.out.println("*****************************************************");
		System.out.println("\nBasic Salary       :"+basic_salary);
		System.out.println("\nTA       :"+TA);
		System.out.println("\nDA       :"+DA);
		System.out.println("\nHRA      :"+HRA);
	}


}