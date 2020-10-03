package Prgs7;
import java.util.*;
public class Finger_Count {
	static int count(int n) //n=30
	{
		int r =n%8; 
		if (r==1)
			return r;
		if(r==5)
			return r;
		if(r==0 || r==2)
			return 2;
		if (r==3||r==7)
			return 3;
		if(r==4 ||r==6)
			return 4;
		return n;
	}	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter number :");
	int n = sc.nextInt(); // n=30
	System.out.println(count(n));
 }  }

