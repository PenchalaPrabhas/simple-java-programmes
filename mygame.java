package mywork1;

import java.util.Scanner;

public class mygame {
	public static void dis(int v)
	{
		for(int i=0;i<v;i++)
		{
			System.out.print(" |");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=21,y;
		System.out.println("rule:- user can take only 1-4 match sticks \nif last match stick taken by user then user is loss \nlets start the game");
		dis(x);
		while(x>1)
		{
			System.out.println("");
			System.out.println("user have to take match stick:--");

			y=sc.nextInt();
			if(y==1)
			{
				x=x-4-1;
				System.out.println("computer take 4");
				System.out.printf("remaining are %d",x);
				System.out.println("");
				dis(x);
			}
			else if(y==2)
			{
				x=x-3-2;
				System.out.println("computer take 3");
				System.out.printf("remaining are %d",x);
				System.out.println("");
				dis(x);
			}
			else if(y==3)
			{
				x=x-2-3;
				System.out.println("computer take 2");
				System.out.printf("remaining are %d",x);
				System.out.println("");
				dis(x);
			}
			else if(y==4)
			{
				x=x-1-4;
				System.out.println("computer take 1");
				System.out.printf("remaining are %d",x);
				System.out.println("");
				dis(x);
			}
			else
			{
				System.out.println("wrong input try again");
			}
		}
	System.out.println("user loss the game, computer won the game");
	}

}
