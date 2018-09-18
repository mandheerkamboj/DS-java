import java.util.Scanner;
class Maxreturn
{
	public static char max(String str)
	{	char ch,ch1;
		int count=0;
		int temp=0;
		int len=str.length();
		char c='a';
		for(int i=0;i<str.length()-1;i++)
		{	ch=str.charAt(i);
			for(int j=i+1;j<str.length();j++)
			{
				ch1=str.charAt(j);
				if (ch==ch1)
				{
					count++;
				}
				if (count>temp)
				{
					temp=count;
					c=ch;
				}
			}
		}
		return c;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String : ");
		String str=sc.nextLine();
		System.out.print(max(str));
	}
}