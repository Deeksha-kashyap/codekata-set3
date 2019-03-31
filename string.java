import java.util.*;
public class Progam
{
  public static void main(String[] args)
  {
    System.out.println(isNumeric("123"));
    System.out.println(isNumeric("123.45"));
    System.out.println(isNumeric("$123"));
    System.out.println(isNumeric("123x"));
  }
  public static boolean isNumeric(String str)
  {
    try
    {
      double d = Double.parseDouble(str);
    }
    catch(NumberFormatException nfe)
    {
      return false;
    }
    return true;
  }
}
