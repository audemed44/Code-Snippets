import java.util.*;
import java.util.streams.*;

public static String replace(String a, String b) {

StringBuilder sb = new StringBuilder();

for(int i =0; i<a.length(); i++) {

    if(a.charAt(i)!=' ')
        sb.append(a.charAt(i));
    else
        sb.append(b);
}


return sb.toString();

}