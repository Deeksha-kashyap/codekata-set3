import java.util.*;
public class Time
{
   public static void main(String[] args)
   {
      Scanner scan=new Scanner(System.in);
      int h1,h2,m1,m2;
      int h,m;
      System.out.println("Enter the first hour");
      h1=scan.nextInt();
      System.out.println("Enter the first minute");
      m1=scan.nextInt();
      System.out.println("Enter the Second hour");
      h2=scan.nextInt();
      System.out.println("Enter the Second minute");
      m2=scan.nextInt();
      System.out.printf("1st time before=%d:%d\n",h1,m1);
      System.out.printf("2nd time before=%d:%d\n",h2,m2);
      h=h2-h1;
      m=m2-m1;
      System.out.printf("Time after the subtraction= %d:%d",h,m);
   }
}
