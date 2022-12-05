//tic -tao-toe game computer vs human
package mywork1;
import java.util.Scanner;
public class mygame3 
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
			System.out.println("");
			System.out.printf("your turn '%c':-",ch);
		}
		else
		{
			ch='X';
			z=11;
		}
		if(j%2==0)
		{
		y=sc.nextInt();
		}
		else
		{
			System.out.println("");
			//1st row
			if((a[0]==a[2]) && (a[1]!=10 && a[1]!=11))
			{
				y=1+1;
			}
			else if((a[1]==a[2]) && (a[0]!=10 && a[0]!=11))
			{
				y=0+1;
			}
			else if((a[1]==a[0]) && (a[2]!=10 && a[2]!=11))
			{
				y=2+1;
			}
			//2nd row
			else if((a[3]==a[4]) && (a[5]!=10 && a[5]!=11))
			{
				y=5+1;
			}
			else if((a[5]==a[4]) && (a[3]!=10 && a[3]!=11))
			{
				y=3+1;
			}
			else if((a[3]==a[5]) && (a[4]!=10 && a[4]!=11))
			{
				y=4+1;
			}
			//3rd row
			else if((a[6]==a[7]) && (a[8]!=10 && a[8]!=11))
			{
				y=8+1;
			}
			else if((a[8]==a[7]) && (a[6]!=10 && a[6]!=11))
			{
				y=6+1;
			}
			else if((a[6]==a[8]) && (a[7]!=10 && a[7]!=11))
			{
				y=7+1;
			}
			//1st column
			else if((a[0]==a[3]) && (a[6]!=10 && a[6]!=11))
			{
				y=6+1;
			}
			else if((a[6]==a[3]) && (a[0]!=10 && a[0]!=11))
			{
				y=0+1;
			}
			else if((a[0]==a[6]) && (a[3]!=10 && a[3]!=11))
			{
				y=3+1;
			}
			//3rd column
			else if((a[2]==a[8]) && (a[5]!=10 && a[5]!=11))
			{
				y=5+1;
			}
			else if((a[5]==a[8]) && (a[2]!=10 && a[2]!=11))
			{
				y=2+1;
			}
			else if((a[2]==a[5]) && (a[8]!=10 && a[8]!=11))
			{
				y=8+1;
			}
			//3rd column
			else if((a[7]==a[4]) && (a[1]!=10 && a[1]!=11))
			{
				y=1+1;
			}
			else if((a[1]==a[7]) && (a[4]!=10 && a[4]!=11))
			{
				y=4+1;
			}
			else if((a[1]==a[4]) && (a[7]!=10 && a[7]!=11))
			{
				y=7+1;
			}
			//1st diagonal
			else if((a[0]==a[4]) && (a[8]!=10 && a[8]!=11))
			{
				y=8+1;
			}
			else if((a[0]==a[8]) && (a[4]!=10 && a[4]!=11))
			{
				y=4+1;
			}
			else if((a[8]==a[4]) && (a[0]!=10 && a[0]!=11))
			{
				y=0+1;
			}
			//2nd diagonal 
			else if((a[2]==a[4]) && (a[6]!=10 && a[6]!=11))
			{
				y=6+1;
			}
			else if((a[2]==a[6]) && (a[4]!=10 && a[4]!=11))
			{
				y=4+1;
			}
			else if((a[6]==a[4]) && (a[2]!=10 && a[2]!=11))
			{
				y=7+1;
			}
			//default values
			else if((a[4]!=10 && a[4]!=11))
			{
				y=5;
			}
			else if((a[0]!=10 && a[0]!=11))
			{
				y=1;
			}
			else if (a[8]!=10 && a[8]!=11)
			{
				y=9;
			}
			else if(a[2]!=10 && a[2]!=11)
			{
				y=3;
			}
			else if((a[6]!=10 && a[6]!=11))
			{
				y=7;
			}
			else if(a[3]!=10 && a[3]!=11)
			{
				y=4;
			}
			else if(a[1]!=10 && a[1]!=11)
			{
				y=2;
			}
			else if(a[5]!=10 && a[5]!=11)
			{
				y=6;
			}
			else
			{
				y=8;
			}
			System.out.print("computer chooses:- ");
			System.out.println(y);
		}
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
		if (ch=='X')
		{
			System.out.println("winner is computter");
		}
		else
		{
			System.out.println("winner is user");
		}
	}	
System.out.println("thanks for playing.....");
}
}