import java.util.*;

class Student
{
  float marks;
  int roll_num;
  char grade;
  String name;
  
 void get_stud_info()
 {
   Scanner sc=new Scanner(System.in);
   
   System.out.println("Enter Student name     :");
   name=sc.nextLine();
   
   System.out.println("Enter Student roll_num :");
   roll_num=sc.nextInt();
   
   System.out.println("Enter Student marks    :");
   marks=sc.nextFloat();
   
   System.out.println("Enter Student grade    :");
   grade=sc.next().charAt(0);
  }
  void disp_stud_info()
  {
    System.out.println("*********************Student Informatiom System*******************");
	System.out.println("Student Name       :"+name);
	System.out.println("Student Roll_no    :"+roll_num);
	System.out.println("Student Marks      :"+marks);
	System.out.println("Student Grade      :"+grade);
  }
  public static void main ( String args[])
  
 {
   Student s1=new Student();
   s1.get_stud_info();
   s1.disp_stud_info();
 }
}
  
  
  
  
  
  
  
  
  
  