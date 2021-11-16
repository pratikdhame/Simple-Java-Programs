import java.util.*;
class Hotel
{

 String customerName;
 long mobileNumber;
 long aadharNumber;
 String cheakInTime;
 String cheakOutTime;
 String cheakInDate;
 String cheakOutDate;
 Scanner sc=new Scanner(System.in);
 
 void getCustomerInfo()
 {
	 System.out.println("Enter CustomerName   :");
	 customerName=sc.nextLine();
	 
	 System.out.println("Enter Mobile Number  :");
	 mobileNumber=sc.nextLong();
	 
	 System.out.println("Enter Aadhar Number  :");
	 aadharNumber=sc.nextLong();
	 
	 System.out.println("Enter Cheak In Time  :");
	 sc.nextLine();
	 cheakInTime=sc.nextLine();
	 
	 System.out.println("Enter Cheak Out Time :");
	 cheakOutTime=sc.nextLine();
	 
	 System.out.println("Enter Cheak In Date  :");
	 cheakInDate=sc.nextLine();
	 
	 System.out.println("Enter Cheak Out Date :");
     cheakOutDate=sc.nextLine();
 }
 
 void displayCutomerInfo()
 {
    System.out.println("Customer Name  :"+customerName);
	
    System.out.println("Mobile Number  :"+mobileNumber);
	
    System.out.println("Aadhar Number  :"+aadharNumber);
	
    System.out.println("CheakIn  Time  :"+cheakInTime);
	
    System.out.println("CheakOut Time  :"+cheakOutTime);
	
    System.out.println("CheakIn  Date  :"+cheakInDate);
	
    System.out.println("CheakOut Date  :"+cheakOutDate);
 }
 
 public static void main(String args[])
 {
	 
	Hotel H[]=new Hotel[5];
	int i;
	
	for(i=1;i<=4;i++)
	{
		H[i]=new Hotel();
	}
	
    for(i=1;i<=4;i++)
	{ 
      H[i].getCustomerInfo();
    }
	for(i=1;i<=4;i++)
	{ 
      H[i].displayCutomerInfo();
    }

} 
}



 
	 
    
	
 
 
 
 
 
 
 
 
 
 
 
 
 
