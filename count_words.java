import java.util.*;
class Words
{ 
   static int wordcount(String value)
   {
      int count=0;
       char ch[]= new char[value.length()];     
            for(int i=0;i<value.length();i++)  
            {  
                ch[i]= value.charAt(i);  
                if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
                    count++;  
            }  
            return count;  
   }
   public static void main(String[] args)
   {
      String value ="    India Is My Country";  
         System.out.println(wordcount(value) + " words");   
   }
}
