/*Problem Statement=>
*  1.5 To get the name using the command line.
* */

package com.bridgelabz;

import java.util.Scanner;
public class CommandLineArgument
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Taking Input Using Command line ");
        System.out.println("Please enter your Name: ");
        String name = scanner.nextLine();
        System.out.println("User Input from console: " + name);

    }

}
