//8 puzzle game
package mywork1;
import java.util.Scanner;
public class mygame4 {
	public static boolean isover(int a[])
	{
		for(int i=0;i<9;i++)
		{
			if((a[i]!=i+1)&&i<8)
			{
				return false;
			}
			if((i==8)&&(a[i]!=0))
			{
				return false;
			}
		}
		return true;
	}
	public static boolean input(int a[])
	{
		for(int i=0;i<9;i++)
		{
			for(int k=i+1;k<9;k++)
			{
				if(a[k]<a[i])
				{
					int temp=a[k];
					a[k]=a[i];
					a[i]=temp;
				}
			}
		}
		for(int i=0;i<9;i++)
		{
			if((a[i]!=i))
			{
				return false;
			}
		}
		return true;
	}
	
	
	public static void print()
	{
		System.out.println("you think you are intelligent ,then the programmer is more intelligent than you");
	}
	public static void printi()
	{
		System.out.println("you entered wrong inputs, please check it");
	}
public static void display(int a[])
{
	int i;
	for(i=0;i<9;i++)
	{
		if(i==3|i==6)
		{
			System.out.println("");
		}
		if(a[i]==0)
		{
			System.out.print("  ");
		}
		else
		{
			System.out.printf(a[i]+" ");
		}
	}
	System.out.println("");
}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a[]= {2,3,1,5,0,7,8,6,4},x,emp=5,t,n=0,m=0;
		int b[]=new int[9];
		while(true) {
			System.out.println("enter d (default game)or\n      u user defined game");
			String str=sc.next();
			str=str.toLowerCase();
			char st=str.charAt(0);
			if(st=='u')
			{
				System.out.println("enter zero for empty space");
				for(int i=0;i<9;i++)
				{
					b[i]=sc.nextInt();
				}
				break;
			}
			else if(st=='d')
			{
				for(int i=0;i<9;i++)
				{
				b[i]=a[i];
				}
				break;
			}
			else
			{
				System.out.println("wrong choice enter it again");
			}
		}
		for(int i=0;i<9;i++)
			{
			a[i]=b[i];
			}
		if(!(input(b)))
			{
			m=1;
			n=-2;
			}
		for(int k=0;k<9;k++)
			{
			if(a[k]==0)
				{
				emp=k;
				}
			}
		if((isover(a)))
			{
			m=1;
			}
		while(m==0)
			{
			if((isover(a)))
				{
				m=1;
				}
			display(a);
			System.out.println("");
			System.out.println("choose 2,4,6,8 for moving empty.....999 to stop game");
			x=sc.nextInt();
			if((x==2)&&(emp!=6)&&(emp!=7)&&(emp!=8))
			{
				t=a[emp+3];
				a[emp+3]=a[emp];
				a[emp]=t;
				emp=emp+3;
				n++;
			}
			else if((x==8)&&(emp!=0)&&(emp!=1)&&(emp!=2))
			{
				t=a[emp-3];
				a[emp-3]=a[emp];
				a[emp]=t;
				emp=emp-3;
				n++;
			}
			else if((x==6)&&(emp!=2)&&(emp!=5)&&(emp!=8))
			{
				t=a[emp+1];
				a[emp+1]=a[emp];
				a[emp]=t;
				emp++;
				n++;
			}
			else if((x==4)&&(emp!=0)&&(emp!=3)&&(emp!=6))
			{
				t=a[emp-1];
				a[emp-1]=a[emp];
				a[emp]=t;
				emp--;
				n++;
			}
			else if(x==999)
			{
				n++;
				m=1;
			}
			else
			{
				System.out.println("wrong input try again");
			}
			if((isover(a)))
			{
				m=1;
			}
		}
		display(a);
		if(n>0)
		{
			System.out.printf("you used this number of moves %d",n);
			if(isover(a))
			{
				System.out.println("\nyou win the gaem");
			}
			else
			{
				System.out.println("\nbetter luck next time");
			}
		}
		else if(n==0)
		{
			print();
		}
		else
		{
			printi();
		}
	}

}
