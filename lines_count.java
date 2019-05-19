import java.util.*;
class Lines
{
     public static int getLineCount(String l){
         
        return l.split("[\n|\r]").length;
    }
   public static void main(String[] args)
   {
         String str = "line1\nline2\nline3\rline4";
        System.out.println(str);
        int count = getLineCount(str);
        System.out.println("line count: "+count);
   }
}
