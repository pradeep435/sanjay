import java.util.Scanner;
class methodoverload
{
int add(int a, int b)
{
return a+b;
}
int add (int a,int b ,int c)
{
return (a+b)*c;
}
public static void main(String args[])
{
Scanner Scan = new Scanner(System.in);
methodoverload method = new methodoverload();
System.out.println("value a, b and c");
int x = Scan.nextInt();
int y = Scan.nextInt();
int z = Scan.nextInt();
System.out.println("sum:"+method.add(x,y,z));
}
}
