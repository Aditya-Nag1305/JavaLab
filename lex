package nag;
import java.util.Scanner;

public class lex {
	public static void main(String[]args)
	{
		Scanner in = new Scanner(System.in);
		String[] input = new String[5];
		System.out.println("Enter 5 strings");
		for(int i=0;i<5;i++)
		{
			input[i]=in.nextLine();
		}
		for(int i=0;i<5;i++)
		{
			for(int j=i+1;j<5;j++)
			{
				if(input[i].compareTo(input[j])>0)
				{
					String temp=input[i];
					input [i]=input[j];
					input[j]=temp;
				}
			}
		}
		System.out.println("Sorted strings are: ");
		for(int i=0;i<5;i++)
		{
			System.out.println(input[i]);
		}
	}
}
