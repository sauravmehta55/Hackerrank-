import java.util.*;
class PlusMinus{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int count=0;
		int counts=0;
		int coun=0;
		for(int j=0;j<n;j++)
		{
			if(arr[j]>0)
			{
				count++;
 			}
 			else if(arr[j]<0)
 			{
 				counts++;
 			}
 			else{
 				coun++;
 			}
		}
		double s=(float)count/n;
		double l=(float)counts/n;
        double m=(float)coun/n;
		System.out.println(s);
		System.out.println(l);
		System.out.println(m);
	}
}