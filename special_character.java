import java.util.*;
class Special
{
  public static void main(String[] args)
  {
     String s="@djgb12348wihging%bvmbd";
     int upper = 0, lower = 0, number = 0, special = 0; 
  
        for(int i = 0; i < s.length(); i++) 
        { 
            char ch = s.charAt(i); 
            if (ch >= 'A' && ch <= 'Z') 
                upper++; 
            else if (ch >= 'a' && ch <= 'z') 
                lower++; 
            else if (ch >= '0' && ch <= '9') 
                number++; 
            else
                special++; 
        } 
  
        System.out.println("Lower case letters : " + lower); 
        System.out.println("Upper case letters : " + upper); 
        System.out.println("Number : " + number); 
        System.out.println("Special characters : " + special); 
    } 
}
