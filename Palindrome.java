# Palindrome
import java.io.*;
import java.util.*;
public class Palindrome
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int n=sc.nextInt();
int a,b,c;
b=n;
while(n>0)
{
a=n%10;
n=n/10;
c=n*10+a;
}
if(c==b)
{
System.out.println("Palindrome");
}
else
{
System.out.println("Not a Palindrome");
}
}
}
