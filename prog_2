/**
To check whether an ASCII code 
input from keyboard represents
 a digit, a lower case character, 
upper case character or a 
special case character.
ASCII Range	Characters
48-57	0-9(digit)
65-90	A-Z
97-122	a-z
else	Special character
*/

import java.util.*;
public class prog_2
{
    public static void main ()
    {
        
        Scanner x = new Scanner (System.in);
        
        String isac = x.nextLine();
        char same = isac.charAt(0);
        int val =(int) same;
        
        if(val<=57)
        {
            System.out.println("Digit");
        }
        else if(val>64 && val<91)
        {
            System.out.println("CAPS LETTER");
        }
        
        else if(val>96 && val<123)
        {
            System.out.println("small letter");
        }
        
        else 
        {
            System.out.println("Special Character");
        }
       
        
    }
}
