import java.io.*;
import java.util.*;

public class Program3 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A = "madam";
        StringBuilder str1=new StringBuilder(A);
        StringBuilder reverse = str1.reverse();
       String  s = new String(reverse);
       //compareTo()
       if(s.equals(A))
        {
        	System.out.println("yes");
        }
        else
        {
        	System.out.println("No");
        }
    }
}



