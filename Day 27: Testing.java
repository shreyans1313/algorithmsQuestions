import java.util.*;

public class Solution {

    public static int minimum_index(int[] seq) {
        if (seq.length == 0) {
            throw new IllegalArgumentException("Cannot get the minimum value index from an empty sequence");
        }
        int min_idx = 0;
        for (int i = 1; i < seq.length; ++i) {
            if (seq[i] < seq[min_idx]) {
                min_idx = i;
            }
        }
        return min_idx;
    }

    static class TestDataEmptyArray 
    {
        public static int[] get_array() 
        {
            int a[]=new int[0];
            return a;
            // complete this function
        }
    }

    static class TestDataUniqueValues {
        public static int[] get_array()
       {
           int a[]=new int[5];
           a[0]=1;
           a[1]=2;
           a[2]=3;
           a[3]=4;
           a[4]=5;
           return a;
            // complete this function
        }

        public static int get_expected_result() 
        {
            return minimum_index(get_array());
            // complete this function
        }
    }

    static class TestDataExactlyTwoDifferentMinimums 
    {
        public static int[] get_array() 
        {
            int a[]=new int[7];
            a[0]=1;
           a[1]=2;
           a[2]=3;
           a[3]=4;
           a[4]=3;
           a[5]=2;
           a[6]=1;
           return a;
            // complete this function
        }

        public static int get_expected_result() 
        {
            return minimum_index(get_array());
            // complete this function
        }
    }

    
