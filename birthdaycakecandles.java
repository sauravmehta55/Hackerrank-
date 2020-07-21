import java.util.*;
class birthdaycakecandles{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();		
		}
		int max=0;
		int count=0;
		for(int j=0;j<n;j++)
		{
			if(max<arr[j])
			{
				max=arr[j];
			}
		}
		for(int k=0;k<n;k++)
		{
			if(max==arr[k])
			{
				count++;
			}
		}
			System.out.println(count);
	}
}