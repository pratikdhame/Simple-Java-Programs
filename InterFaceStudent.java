interface boy 
{
  String name="soham";
  int marks=100;
 
} 


class InterFaceStudent implements boy
{

   
	void Display_stud()
	{
	  System.out.println("Student Name is "+name);
	  System.out.println("Marks of student="+marks);
	}
	
	 public static void main(String args[])
{
  InterFaceStudent s=new InterFaceStudent();
  s.Display_stud();
}
}
	
	