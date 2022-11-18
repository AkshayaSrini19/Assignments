
public class PangramWord {

	public static void main(String[] args) {
		String s1="ABCDEIJKLMNOPQRSTUVWXYZ";
		char[] ch=s1.toCharArray();
		int a[]=new int[26];
		boolean flag=false;
		for(int i=0;i<ch.length;i++)
		{
			int index=ch[i]-65;
			a[index]++;
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
			{
				System.out.println("it is not a pangram");
				flag=true;
			}
		}
		if(flag==false)
		{
			System.out.println("it is a pangram");
		}

	}

}
