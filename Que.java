import java.util.Scanner;
public class Que
{
public static void main(String args[])
{
//TODO Auto-generated method stub
int count=0,n;
int arr[]=new int[20];
Scanner sc=new Scanner(System.in);
System.out.println("enter the number of employee");
n=sc.nextInt();
if(n<0)
{
System.out.println("invalid input");
System.exit(0);
}
else
{
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
if(arr[i]<0)
{
System.out.println("invalid input");
System.exit(0);
}
}
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
if(arr[i]==arr[j])
{
count++;
}
}
}
System.out.println(count);
}
}
}

