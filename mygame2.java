
//tic-tac-tao 2 players
package mywork1;
import java.util.*;
public class mygame2 
{
	public static boolean check(int a[])
	{
		for(int i=0;i<9;i++)
		{
			if(!(a[i]==11 | a[i]==10))
			{
				return false;
			}
		}
		return true;	
	}
	public static void display(int a[])
	{
		System.out.print("         ");
		for(int i=0;i<9;i++)
		{
			if(i==3|i==6)
			{
				
				System.out.print("\n         ");
			}
			if(a[i]==10)
			{
				System.out.print("O ");
			}
			else if(a[i]==11)
			{
				System.out.print("X ");
			}
			else
			{
				System.out.print(a[i]+" ");
			}
		}
		System.out.println("");
	}
	public static boolean iswin(int a[],int o)
	{
		if((a[0]==o&a[1]==o&a[2]==o)|(a[3]==o&a[4]==o&a[5]==o)|(a[6]==o&a[7]==o&a[8]==o)|(a[0]==o&a[3]==o&a[6]==o)|(a[1]==o&a[4]==o&a[7]==o)|(a[2]==o&a[5]==o&a[8]==o)|(a[0]==o&a[4]==o&a[8]==o)|(a[2]==o&a[4]==o&a[6]==o))
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9},j=0,y=0,z=0;
		char ch='l';		
		boolean i=false,m=false;
		Scanner sc =new Scanner(System.in);
		System.out.println("rule:- you have to choose 1-9 ");
		while(i==false)
		{
			display(a);
			if(j%2==0)
			{
				ch='O';
				z=10;
			}
			else
			{
				ch='X';
				z=11;
			}
			System.out.println("");
			System.out.printf("your turn '%c':-",ch);
			y=sc.nextInt();
			if((y>0&&y<10)&&(a[y-1]==10|a[y-1]==11))
			{
				System.out.printf("----------already used %d--------- \n",y);
		
			}
			else if(y>0&&y<10)
			{
				j++;
				a[y-1]=z;
				i=m= iswin(a,z);
			}
			else
			{
				System.out.println("----invalid input---- choose(1-9)");
			}
			
			if(check(a))
			{
				i=true;
			}
			
			
		}
		display(a);
		if(m==false)
		{
			System.out.println("\ngame tie-- no one win");
		}
		else
		{
			System.out.printf("\nwinner is %c \n",ch);
		}	
	System.out.println("thanks for playing.....");
	}
}