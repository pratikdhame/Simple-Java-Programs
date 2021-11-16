import java.util.*;

class Book 
{  
  int BookID;
  String BookName;
  float Price;
  
  void get_book_info()
  {
	Scanner sc=new Scanner(System.in);
	
    System.out.println("Enter BookID   :");
    BookID=sc.nextInt();
	
	System.out.println("Enter Price    :");
	Price=sc.nextFloat();

	System.out.println("Enter BookName :");
	BookName=sc.nextLine();
  }
  
  void disp_book_info()
  {
    System.out.println("Book ID is =" +BookID);
	System.out.println("Book Price =" +Price);
	System.out.print("Book name  =" +BookName);
	
  }
  
  
  public static void main(String args[])

  { 
    Book b1=new Book();

	b1.get_book_info();

	b1.disp_book_info();

	
  }
}
   
	
	
	
	
	
  
  
