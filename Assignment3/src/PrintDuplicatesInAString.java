
public class PrintDuplicatesInAString {

	public static void main(String[] args) {
		String s="Good Morning";
		char ch[]=s.toCharArray();
		int i,j,k=0;
		for(i=0;i<ch.length;i++)
		{
			for(j=0;j<i;j++)
			{
			if(ch[i]==ch[j])
			{
				System.out.println(ch[i]);
			}
			}
		
	}

}
}