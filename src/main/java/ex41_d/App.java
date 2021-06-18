package ex41_d;
/*
Alphabetizing the contents of a file, or sorting its contents, is a great way to get comfortable manipulating a file in your program.

Create a program that reads in the following list of names from a file called `exercise41_input.txt` and sorts the list alphabetically:

Ling, Mai
Johnson, Jim
Zarnecki, Sabrina
Jones, Chris
Jones, Aaron
Swift, Geoffrey
Xiong, Fong
Then print the sorted list to a file called `exercise41_output.txt` that looks like the following example output.

Example Output
Total of 7 names
-----------------
Johnson, Jim
Jones, Aaron
Jones, Chris
Ling, Mai
Swift, Geoffrey
Xiong, Fong
Zarnecki, Sabrina
 */

//Pseudocode
/*

1. Read file
We have to create new file object to read the file
we are going to use try and catch to check if there was an error reading the file
//Completed

2. Save the information and sort it - How we are going to sort it?
We are going to create an arraylist and add all the names there since we don't know exactly the size of the array.
Then we can sort the Arraylist with the functions of collection.
//Completed


3. Export the information into a txt.
We have to close the file so the data can't leak
FileWriter Output = new FileWriter("exercise41_output.txt"); To write to a new file
Output is closed.

//Completed
 */

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Luis Andres Acosta Mejia
 */

import java.io.File;  // Import the File class
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args){

        ArrayList<String> names = new ArrayList<>(); //To save the names
        String design = "-----------------";

        Read_Write import_export = new Read_Write(); //Creating an object of the class.

        import_export.Reading(names); //Using the method to read.
        System.out.println(" ");

        Collections.sort(names); //It is sorted.

        import_export.Writing(names,design); //Using the method to write.

    }
}
