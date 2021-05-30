package org.example;
import java.io.*;
import java.util.Scanner;
/**
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner myObj = new Scanner(System.in);
        System.out.println( "What is the input string? " );
        String word =  myObj.nextLine();
        System.out.println("The length is:" + word.length());
    }
}
