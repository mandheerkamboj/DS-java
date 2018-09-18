import java.util.Scanner;
class Subsequence
{
	public static void sequence(String str)
	{
		for(int i=0;i<str.length();i++)
   		{
   			for(int j=i+1;j<=str.length();j++)
   			{
        		System.out.println(str.substring(i,j));
   			}
 		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String :");
		String Str=sc.nextLine();
		sequence(Str);
	}
}