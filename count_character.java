import java.util.Scanner;
public class Program
{
public static void main(String[] args)
{
System.out.println("Enter the String");
Scanner scan=new Scanner(System.in);
String input = scan.nextLine();
char [] ch = input.toCharArray();
int count=0;
for (int i = 0; i < ch.length; i++)
{
if (ch[i]!=' ')
{
count++;
}
}
System.out.println(count++);
}
}
