import java.util.Scanner;
class Palindrome
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter string: ");
		String str=sc.nextLine();
		String rev="";
		int x=str.length()-1;
		for(int i=x;i>=0;i--)
		{
			rev=rev+str.charAt(i);
			
		}
		if(rev==str)
			System.out.println("It is a palindrome");
		else
			System.out.print("It is not palindrome");
	}
}