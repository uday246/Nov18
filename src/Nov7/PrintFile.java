package Nov7;

import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class PrintFile // this is CopyFile.java in the Sakai Week 12 Source Code folder
{
   public static void main(String[] args) // uses program command line arguments
   {
   /* as mentioned above, change this so the program only expects 1 command line
   argument, and if that's not the case it prints Usage: PrintFile filename */
      
       if (args.length != 2) { // change this if condition
           System.out.println("Usage: CopyFile inputFile outputFile"); // change this error message
           System.exit(0);
       }
      
       Scanner170 inStream = new Scanner(new File(args[0]));
       if (inStream == IO.inError) {
           System.out.println("Error: could not read input file " + args[0]);
           System.exit(0);
       }
      
       /* as mentioned above, remove this output stream processing section, it's not
       needed for PrintFile: */
      
       PrintStream outStream = IO.newFile(args[1]); // assure output doesn't exist yet
       if (outStream == IO.outError) {
           System.out.println("Error: could not create output file " + args[1]);
           System.exit(0);
       } // could also use IO.exists(args[1]) first to check if output file exists

       /* here is where to add code to create a List<String> with a variable list and
       instantiate it with an ArrayList<String> - add one line of code here: */
      
      
       /* as mentioned above, modify the while loop body so that it uses List's add
       method to add each line from the input file to list: */
      
       while (inStream.hasNextLine())
           outStream.println(inStream.nextLine()); // replace this line to use List's add

       inStream.close(); // close the input file when done reading from it
      
       /* remove the following line since there is no longer an output file stream: */
      
       outStream.close(); // close the output file when done writing to it
      
       /* here is where you print out There are n lines in the file: - use list.size()
       to determine how many lines there are in the file (the number put in the list): */
      
      
       /* finally, write a for-each loop here to pull out each String that is in list and
       print it to the monitor: */
      
      
   }
}
