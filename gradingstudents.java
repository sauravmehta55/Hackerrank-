import java.util.*;
class gradingstudents{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int j=0;j<n;j++)
		{
			if(arr[j]>=38)
			{
				if(arr[j]%5==3)
				{
					arr[j]=arr[j]+2;
				}
				else if(arr[j]%5==4)
				{
					arr[j]=arr[j]+1;
				}
				else
				{
					arr[j]=arr[j];
				}
				//System.out.println(arr[j]);
			}
			else 
			{
				arr[j]=arr[j];
			}
			System.out.println(arr[j]);
		}}}
