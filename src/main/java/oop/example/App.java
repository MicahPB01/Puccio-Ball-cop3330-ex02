package oop.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner getName = new Scanner(System.in);

        System.out.print( "What is the input string? " );

        String name = getName.nextLine();

        if(name.length() != 0 ) {
            System.out.printf("%s has %d characters.\n", name, name.length());
        }
        else   {
            System.out.printf("You must enter something!\n");
        }


    }
}
