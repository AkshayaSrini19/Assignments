import java.util.Arrays;

public class AnagramProgram {
	
	public static void main(String[] args)
	{
		String s1="Ear";
		String s2="Are";
		 s1=s1.toLowerCase();
		 s2=s2.toLowerCase();
		int i,j = 0;
		char temp;
		char c[]=s1.toCharArray();
		char c1[]=s2.toCharArray();
		for(i=c.length;i>=0;i--)// to sort the alphabets ascending
			{
			for(j=i+1;j<c.length;j++)
			{
				if(c[i]>c[j])
				{
				temp=c[i];
				c[i]=c[j];
				c[j]=temp;
			    }
			}
			}
		for(i=0;i<c.length;i++)
			System.out.print( c[i]);
		System.out.println();
		
		
		for(i=c1.length;i>=0;i--)// to sort the second string alphabets ascending
		{
		for(j=i+1;j<c1.length;j++)
		{
			if(c1[i]>c1[j])
			{
			temp=c1[i];
			c1[i]=c1[j];
			c1[j]=temp;
		}
		}
	}
		
		for(i=0;i<c1.length;i++)
			System.out.print(c1[i]);// to print second sorted word
		
		//to check if anagram or not
		
				if(Arrays.equals(c, c1))
					System.out.println("yes");
				else
					System.out.println("no");
			
			}
		
		}


