import java.util.Scanner;
public class Time{
    public static void main(String[]args){
        int inMins=0;
        int hours=0;
        int mins=0;
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the time in mins: ");
        inMins= sc.nextInt();
        hours=(int)(inMins/60);
        mins =(int)(inMins%60);
        System.out.printf("%d:%d",hours,mins);
    }
}
