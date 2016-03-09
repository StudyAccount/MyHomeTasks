package com.goit.gojavaonline;


import java.util.Scanner;

import static java.lang.Math.*;

/**
 * Created by User on 09.03.2016.
 */
public class LengthCount {
    public static void main(String[] args) {

        System.out.println("Select coordinates (x1,y1) and (x2, y2)");
        Scanner scanner = new Scanner(System.in);
        System.out.print ("x1 ");
        int x1=scanner.nextInt();
        System.out.print ("y1 ");
        int y1=scanner.nextInt();
        System.out.print ("x2 ");
        int x2=scanner.nextInt();
        System.out.print ("y2 ");
        int y2=scanner.nextInt();

        double currentLength = sqrt(pow(x1 - x2, 2) +pow(y1 - y2, 2));
        System.out.println("\nYour line is " + currentLength + " long");
    }
}
