import java.util.*;
public class NumericCharacter    
{    
    public static void main(String[] args) {    
        String string = "123456789";    
        int count = 0;    
        for(int i = 0; i < string.length(); i++) {    
            if(string.charAt(i) != ' ')    
                count++;    
        }    
        System.out.println("Total number of numeric characters in a string: " + count);    
    }    
}     
