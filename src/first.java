import java.io.*;
import java.util.Scanner;
public class first {
    public static void main(String[] args) throws IOException { // PrintWriter outfile=new PrintWriter("namefile.txt"); //file will be created in the current folder in which the project is created
        String fname;

        //PrintWriter outfile = new PrintWriter("/Users/gandhi/Desktop/namefile.txt"); //file will be created in the specified path //file is created or opened
        Scanner input = new Scanner(System.in); //scanner object to read data from keyboard String choice="yes";
        System.out.println("Enter a file name for output");
        fname=input.nextLine();
        FileWriter fwriter= new FileWriter(fname,true);
        PrintWriter outfile = new PrintWriter(fwriter);
        String name;
        String choice="yes";

        while (!(choice.equals("no"))) { //the loop will be executed util the user enters "no" for choice
            System.out.println("Enter a name to store in a file");
            name = input.nextLine(); //a string is read from keyboard and assigned the the string object
            outfile.println(name); // the value of name object is written into a file
            System.out.println("Do you want to add more names?");
            choice = input.nextLine();
        }
        outfile.close(); // file is closed
    }
}