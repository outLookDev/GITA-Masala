package booleans;

import java.util.Scanner;

public class Boolean25 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
        int x,y;
        boolean b;
        System.out.print ("x:");
        x=scanner.nextInt ();
        System.out.print ("y:");
        y=scanner.nextInt ();
        b=x<0 && y>0;
        // <=>
        System.out.println (b);
    }
}
