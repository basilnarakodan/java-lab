import java.util.Scanner;
class Pattern
{
public static void main(String[] args)
{
Scanner myObj = new Scanner(System.in);
System.out.println("Enter number of rows:");
int n = myObj.nextInt();
int i,j;
for(i=1;i<n;i++)
{
for(j=1;j<=i;j++)
{
System.out.print(i+" ");
}

System.out.println(" ");
}
}
}
