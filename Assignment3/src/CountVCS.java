
public class CountVCS {

	public static void main(String[] args) {
		String s="Hi everyone.Good Morning :)";
		 s=s.toLowerCase();
		int i,countconsonants=0,countvowels=0,countspl=0;
		for(i=0;i<s.length();i++)
		{	
			if(s.charAt(i)=='a'|| s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') 
			{	 
				countvowels++;
			}
			else if(s.charAt(i)>='a' && s.charAt(i)<='z')
			{
				countconsonants++;
			}
			else if(s.charAt(i)!=48-57 && s.charAt(i)!=97-122 &&s.charAt(i)!=65-90)
			{
				countspl++;
			}
			
		}
		
		System.out.println("No of Consonants :" +countconsonants);
		System.out.println("No of Vowels :" +countvowels);
		System.out.println("No of spl.characters :" +countspl);


	}

}
