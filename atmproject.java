//Developer:- Prabhas
//Simple ATM worflow project

package myprojects;
import java.util.Scanner;
public class atmproject
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String ids[]={"345678","238579","239589","342155","123565" };
		System.out.println("Welcome to bhas bank");
		System.out.println("Enter your Credentials");
		System.out.print("User ID:-");
		String id=sc.nextLine();
		System.out.print("Password:-");
		String password=sc.nextLine();
		int c,m=0,z=0,tx;
		int i,cur[]= {23900,1232,4563,9845,43562};
		int sav[]= {2000,3500,2500,8000,10000};
		boolean chec=check(id,password);
		for(i=0;i<5;i++)
		{
			if(id.equals(ids[i]))
			{
			break;
			}
		}
		
		if(chec)
		{
			System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
			while(true)
			{
				System.out.println("Options:-");
				System.out.println("1) Savings Acoount");
				System.out.println("2) Current Account");
				System.out.println("3) Exit");
				System.out.print("Choose an option:-");
				int x=sc.nextInt();
				if(x==1 || x==2 || x==3)
				{
					if(x==3)
					{
						break;
					}
					else if(x==1)
					{
						c=sav[i];
						
					}
					else
					{
						c=cur[i];
					}
					while(true)
					{
						opt();
						int k=sc.nextInt();
					
						if(k==1)
						{
							if(x==1)
							{
								c=sav[i];
								
							}
							else
							{
								c=cur[i];
							}
							
							
							System.out.println("Your Balance amount is :-"+c+"rs");
						}
						else if(k==2)
						{
							System.out.println("Enter amount to With Draw:-");
							m=sc.nextInt();
							if(m<sav[i]||m<cur[i])
							{
							if(x==1)
							{
								c=sav[i]=sav[i]-m;
								
							}
							else
							{
								c=cur[i]=cur[i]-m;
							}
							System.out.println("The latest balance is :-"+c);
							}
							else
							{
								System.out.println("with drawl amount is high");
							}
						}
						else if(k==3)
						{
							System.out.println("Enter amount to Deposite:-");
							m=sc.nextInt();
							if(x==1)
							{
								c=sav[i]=sav[i]+m;
								
							}
							else
							{
								c=cur[i]=cur[i]+m;
							}
							System.out.println("The latest balance is :-"+c);
						}
						else if(k==4)
						{
							break;
						}
						else
						{
							System.out.println("enter correct option");
						}		
					}
				}
				
				else
				{
					System.out.println("Choose an valid option");
				}
				
			}
				
		}
		else
		{
			System.out.println("you enetred wrong credentials");
		}
	
		System.out.println("Thank you for visiting");
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		main(null);
	}	
	
		
		
		
	
	//checking & modifying amount
	
	//checking valid account
	protected static boolean check(String id,String password)
	{
		String ids[]={"345678","238579","239589","342155","123565" };
		String pass[]={"bhas@12","span67.2","dav$345","gian&124","ptas@3g2"};
		String names[]= {"prabhas","jhon","davood","purush","pawan"};
		for(int i=0;i<5;i++)
		{
			if(id.equals(ids[i]) && password.equals(pass[i]) )
			{
				System.out.println("Logge in");
				System.out.println("Hello "+names[i]);
				return true;
			}
			
		}
		
		
		return false;
	}

	
	protected static void opt()
	{
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println("Options");
		System.out.println("1) Check balance");
		System.out.println("2) Withdraw");
		System.out.println("3) Deposite");
		System.out.println("4) exit");
		System.out.print("Choose an option:-");
	}
	
	
}
