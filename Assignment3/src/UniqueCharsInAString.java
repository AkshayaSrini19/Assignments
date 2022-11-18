import java.util.Scanner;

public class UniqueCharsInAString {

	public static void main(String[] args) {
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		s=sc.nextLine();
		//char ch[]=s.toCharArray();
		int i,j,count=0;
	 //   boolean flag = false;
		for(i=0;i<s.length();i++)
		{
			for(j=i+1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
				}
				else
				{
					count=0;
				}
		
			}
		}
		if(count==0)
		{
			System.out.println("unique characters");
		}
		else
		{
			System.out.println("repeated characters");
		}
	}
	}


