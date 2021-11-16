// Write java program to calculate gross salary of employee on the basis of following components
//Take a basic salary  of coustmer
// TA-10%
//DA-5%
//HRA-15%

class Salary
{
   public static void main(String args[])
    {
	    int basic_salary,TA,DA,HRA,gross_salary;
		basic_salary=Integer.parseInt(args[0]);
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