//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String,Integer> PhoneBook=new HashMap<String,Integer>();
        for(int i = 0; i < n; i++)
        {
            String name = in.next();
            int phone = in.nextInt();
            PhoneBook.put(name,new Integer(phone));
            // Write code here
        }
        while(in.hasNext())
        {
            String s = in.next();

            if(PhoneBook.get(s)==null)
            System.out.println("Not found");
            else
            System.out.println(s+"="+PhoneBook.get(s));

            // Write code here
        }
        in.close();
    }
}
