import java.util.Scanner;


public class Project
{
public static void main(String[] args )
{
	char r;
	do 
	{
	System.out.println("*****Library Management Sysytem***" );
	System.out.println("press 1 to add Book" );
	System.out.println("press 2 to issue a book" );
	System.out.println("press 3 to return a book" );
	System.out.println("press 4 to print complete issue details" );
	System.out.println("press 5 to exit" );
	Scanner obj1=new Scanner(System.in);
	int a=obj1.nextInt();
	switch(a)
	{
		case 1:
			Library aa =	new Library();
			aa.Add();
		break;
		case 2:
			Library bb	=	new Library();
			bb.iss();
		break;
		case 3:
			Library cc	=	new Library();
			cc.ret();
		break;
		case 4:
			Library is	=	new Library();
			is.detail();
		break;
		case 5:
			Library add	=	new Library();
			add.exit();
		break;
		default:
			System.out.println("Invalid number");
			
	}
			System.out.println("you want to select a Next option Y/N");
			r=obj1.next().charAt(0);
	}
	while(r=='Y'||r=='y');
	   if(r=='n'||r=='N')
	{
		Library z= new Library();
		z.exit();
	}
}
}
class Library
{
	static String str,b, date;
	static int a,c;


	
	void Add()
	{
		System.out.println("\nEnter book Name\nprice\nBook no\n That you want to add");
		Scanner obj2= new Scanner(System.in);
		String str =obj2.nextLine();
		float price=obj2.nextInt();
		int book_no=obj2.nextInt();
		System.out.println("");
		System.out.println("BOOK_NAME= "+str+"\nBOOK_PRICE= "+price+"\nBOOK_NO= "+book_no);		
	}
	void iss()
	{
		Scanner obj3 = new Scanner(System.in);
		System.out.println("Enter Book name");
		str=obj3.nextLine();
		System.out.println("Enter the book id ");
		a=obj3.nextInt();
		obj3.nextLine();
		System.out.println("Enter issue of the date");
		b=obj3.nextLine();
		System.out.println("Enter Total number of book you want to issue");
		c=obj3.nextInt();
		System.out.println("Return book Date");
		date=obj3.nextLine();
		date=obj3.nextLine();
	}
	int getid()
	{
		return a;		
	}
	void ret()
	{

		System.out.println("Enter student Name and Bookno");
		Scanner c = new Scanner(System.in);
		String name =c.nextLine();
		int bookId= c.nextInt();

		if (a==bookId)
		{
			System.out.println("Total Detail");
			System.out.println("Book Name::"+Library.str);
			System.out.println("Book id::"+Library.a);
			System.out.println("issue date::"+Library.b);
			System.out.println("Total no of issued book::"+Library.c);
			System.out.println("Book Return Date::"+Library.date);
		}
		else 
		{
			System.out.println("Wrong id please correct id");
		}
	}
	void detail()
	{
		System.out.println("Book Name::"+Library.str);
		System.out.println("Book id::"+Library.a);
		System.out.println("Issue date::"+Library.b);
		System.out.println("total number of book issued::"+Library.c);
		System.out.println("Return book date::"+Library.date);
	}
	void exit()
	{
		System.exit(0);
	}
}