
public class MaximumRepeatedCharacters {

	public static void main(String[] args) {
			String s="She sells sea shells in the sea shore";
			s=s.toLowerCase();
		int i,j = 0,alphabets=256;
		int count[]=new int[alphabets];
		for(i=0;i<s.length();i++)
		{
			count[s.charAt(i)]++;
		}
		int max=-1;
		char res=' ';
		for(i=0;i<s.length();i++)
		{
			if(max < count[s.charAt(i)])
			{
				max=count[s.charAt(i)];
				res=s.charAt(i);
			}
		}
		System.out.println("the repeated letter is " + res );
		
}
}