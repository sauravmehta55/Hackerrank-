import java.util.*;
class minimax
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	int max=0;
	int min=0;
	int sum=0;
	int mins=0;
	int maxs=0;
	int j;
	for(j=0;j<n;j++)
	{
		sum=sum+arr[j];
	}
		if(arr[j]<arr[j+1])
		{
			max=arr[j+1];
		}
		else
		{
			min=arr[j];
		}
	mins=sum-min;
	maxs=sum-max;
	System.out.println(min);
	System.out.println(max);
}
}