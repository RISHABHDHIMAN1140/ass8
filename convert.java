import java.util.Scanner;
import java.util.*;
class convert
{
public static void main(String[] args)
{
 String x1,x2;
int p,q;
Scanner S=new Scanner(System.in);
System.out.print("Enter 1st :");
x1=S.next();
System.out.print("Enter 2nd :");
x2=S.next();
p=Integer.parseInt(x1);
q=Integer.parseInt(x2);
if(p>q)
{
System.out.println("Number of 1st string is maximum");
}
else
{
System.out.println("Number of 2nd string is maximum");
}
}
}