import java.util.*;
import java.util.streams.*;

public static int singleNumber(int[] A) {

    int key=0;    
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    for(int i=0; i<A.length; i++)
    {
        if(map.containsKey(A[i]))
            map.put(A[i],map.get(A[i])+1);
        else
            map.put(A[i],1);
    }
    for(Map.Entry<Integer, Integer> entry : map.entrySet())
    {
        if(entry.getValue()==1)
            key = entry.getKey();
    }
    
    return key;
    
    
    }