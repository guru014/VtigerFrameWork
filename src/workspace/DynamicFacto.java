package workspace;

import java.util.Scanner;

public class DynamicFacto {

	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	int no=sc.nextInt();
	int fact=1;
	for(int i=no;i>=1;i--)
	{
		fact=fact*i;
	}
    System.out.println(fact);
	}

}
