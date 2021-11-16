import java.io.*;
class reading
{
	public static void main(String[] args)
	{

		Console cnsl= System.console();

		

		String str = cnsl.readLine(
			"Enter string : ");
			
		System.out.println(
			"You entered : " + str);
	}
}
