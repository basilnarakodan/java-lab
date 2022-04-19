import java.util.Scanner;
class Matrix
{
public static void main(String[] args)
{
Scanner obj=new Scanner(System.in);
int i,j,n,m;
System.out.print("enter number of rows\n");
n=obj.nextInt();
System.out.print("\nenter number of columns\n");
m=obj.nextInt();
int a[][]=new int[n][m];
System.out.print("\nenter first matrix values\n");
for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
a[i][j]=obj.nextInt();
}
System.out.print("\n");
}
int b[][]=new int[n][m];
System.out.print("\nenter secound matrix values\n");
for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
b[i][j]=obj.nextInt();
}
System.out.print("\n");
}
System.out.print("first matrix is:\n");
for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
System.out.print(a[i][j]+"\t");
}
System.out.print("\n");
}
System.out.print("secound matrix is:\n");
for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
System.out.print(b[i][j]+"\t");
}
System.out.print("\n");
}

int c[][]=new int[n][m];
for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
c[i][j]=a[i][j]+b[i][j];
}
}
System.out.print("ADDED matrix is:\n");
for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
System.out.print(c[i][j]+"\t");
}
System.out.print("\n");
}
}
}
