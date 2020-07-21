import java.util.*;
class appleandoranges{
	public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int t=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int m=sc.nextInt();
        int arr[]=new int[m];
        int n=sc.nextInt();
        int arra[]=new int[n];
        for(int i=0;i<m;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++)
        {
            arra[j]=sc.nextInt();
        }
        int x=0;
        int v=0;
        int count=0;
        int counts=0;
        for(int z=0;z<m;z++)
        {
            x=arr[z]+a;
            if(s<=x && x<=t)
            {
                count++;
            }
        }
        System.out.println(count);
        for(int y=0;y<n;y++)
        {
            v=arra[y]+b;
            if(s<=v && v<=t)
            {
                counts++;
            }
            }
            System.out.println(counts);
}}
