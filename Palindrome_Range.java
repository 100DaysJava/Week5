import java.util.*;
public class Palindrome_Range {

	static int isPalindrome(int n) //n=101
	{
		int rev =0;
		for(int i=n; i>0; i/=10) // i=1; ; 1/10 = 0
		{
		   rev = rev*10 + i%10; // rev = 10*10 +1%10 = 1 =101		   
		}
		return (n==rev) ? 1 : 0;		
	}	
	
	static void display(int n1,int n2)
	{
		for(int i = n1; i <= n2; i++)
			if(isPalindrome(i)==1)
				System.out.print(i + " ");
	}
	
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter 2 numbers : ");
    int n1 = sc.nextInt(); // n1 = 100
    int n2 = sc.nextInt(); // n2 = 200
     display(n1,n2);
	} }
