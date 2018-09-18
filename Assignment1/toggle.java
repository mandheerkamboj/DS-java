import java.util.Scanner;
import java.util.Arrays;
class Toggle
{
	public static void tog(String str)
	{
		char []ch=str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			if(ch[i]>='A' && ch[i]<='Z')
			{
				ch[i]+=32;
			}
			else if(ch[i]>='a' && ch[i]<='z')
			{
				ch[i]-=32;
			}
		}
		String s=new String (ch);
		System.out.print(s);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String : ");
		String str=sc.nextLine();
		tog(str);
	}
}