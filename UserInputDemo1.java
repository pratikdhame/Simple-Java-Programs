import java.util.*;  
class UserInputDemo1  
{  

  void inputs()
  {
	 Scanner sc= new Scanner(System.in); 
	 System.out.print("Enter a string: ");  
     String str= sc.readLine(); 
  }  
  void display()
  {
	 System.out.print("You have entered: "+str);    
  }  
	  
public static void main(String[] args)  
  {  
   UserInputDemo1 v1=new UserInputDemo1();
   v1.input();
   v1.display();
  }  
}  