import java.util.*;
import java.util.streams.*;

public static int[] bubbleSortArray(int[] arr){
    int temp = 0;
    for(int i = 0; i < arr.length - 1; i++)
    {
            for(int j = 0; j < arr.length - 1; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
    }
    

    
    return arr;
}