import java.util.Scanner;
class Area
{
public static void main(String[] args)
{
Scanner myObj = new Scanner(System.in);
System.out.println("Enter breadth of rectangle:");
int b = myObj.nextInt();
System.out.println("Enter length of rectangle:");
int l = myObj.nextInt();
int a=l*b;
System.out.println("Area="+a);
}

}
