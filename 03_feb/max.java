import java.util.*;
class Max
{
public static void main(String args[])
{
int a,b,c;
Scanner sc =new Scanner(System.in);
System.out.println("Enter three numbers respectively");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
int greatest=a;
if(b>a&&b>c)
{
	greatest=b;
	System.out.println("greatest number="+b);
}
else if(c>a&&c>b)
{
	greatest=c;
	System.out.println("greatest number="+c);
}
else
	System.out.println("greatest number="+a);
}
}