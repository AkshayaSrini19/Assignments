
public class Palindrome {

	public static void main(String[] args) {
		int num=2552;
		int temp=num;
		int x = 0,sum=0;
		while(num>0)
		{
		x=num%10;
		sum=(sum*10)+x;
		num=num/10;
		}
		if(temp==sum)
		{
			System.out.println("palindrome number");
			
		}
		else
		{
			System.out.println("not a palindrome number");
		}
		}
		
	}


