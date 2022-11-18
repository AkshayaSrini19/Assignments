import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String s1="Good Morning";
		char ch[]=s1.toCharArray();
		int i,j,k=0;
		for(i=0;i<ch.length;i++)
		{
			for(j=0;j<i;j++)
			{
			if(ch[i]==ch[j])
			{
				break;
			}
			}
			
			if(j==i)

			{
				ch[k]=ch[i];
				k++;
				
			}
		}
		
        System.out.println(String.valueOf(Arrays.copyOf(ch, k)));   

		 // System.out.print(ch[i]);	

		
	}
	}

