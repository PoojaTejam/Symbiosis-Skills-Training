import java.util.*;
public class demo12{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter num:");
    int num=sc.nextInt();
int sum=0;
for(int i=1;i<=num;i++)
{
   if(num%i==0)
{
	sum=sum+i;  
}
System.out.println("sum"+sum);
}
}}