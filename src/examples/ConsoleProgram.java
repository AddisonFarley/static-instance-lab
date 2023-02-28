// Addison Farley
// SDEV 219
// static vs instance friday lab

package examples;

import java.util.Scanner;

public class ConsoleProgram
{
    private static Scanner console = new Scanner(System.in);

    public static void main(String[] args)
    {
        console.nextLine();
        //do something with my scanner
        //helperMethod();
    }

    public static void helperMethod()
    {
        console.nextLine();
        //do something
    }
}
