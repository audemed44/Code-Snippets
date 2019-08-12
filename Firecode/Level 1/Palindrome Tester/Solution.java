import java.util.*;
import java.util.streams.*;

public static boolean isStringPalindrome(String str){
    
    if(str==null||str.equals("")) return true;
    StringBuilder sb = new StringBuilder();
    for(int i = str.length()-1; i>=0; i--)
        sb.append(str.charAt(i));
    String reversedString = sb.toString();
    if(reversedString.equals(str))
        return true;
    return false;


}