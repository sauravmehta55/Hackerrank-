import java.util.*;
class birthdaychocolate
{
	public static void main(String[] args)
	{
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  int arr[]=new int[n];
	  for(int i=0;i<n;i++)
	  {
	  	arr[i]=sc.nextInt();
	  }
	  int d=sc.nextInt();
	  int m=sc.nextInt();
	  int count=0;
	  int sum=0;
	  for(int j=0;j<n-1;j++)
	  {
	  	//for(int k=j+1;k<n;k++)
	  	//{
	  	sum=arr[j]+arr[j+1];
	  	if(sum==d)
	  	{
	  		count++;
	  	//}
	  	}}
	  System.out.println(count);
	}}