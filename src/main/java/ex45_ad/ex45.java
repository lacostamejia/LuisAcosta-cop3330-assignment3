package ex45_ad;

import java.util.Scanner;

/*
Exercise 45 - Word Finder
There will be times when you'll need to read in one file, modify it, and then write a modified version of that file to a new file.

Given an input file named `exercise45_input.txt`,
read the file and look for all occurrences of the word utilize.
Replace each occurrence with use. Write the modified file to a new file.

Example Output
Given the input file of

One should never utilize the word "utilize" in writing. Use "use" instead.
For example, "She uses an IDE to write her Java programs" instead of "She
utilizes an IDE to write her Java programs".
The program should generate

Output:

One should never use the word "use" in writing. Use "use" instead.
For example, "She uses an IDE to write her Java programs" instead of "She
uses an IDE to write her Java programs".

Constraints
Prompt for the name of the output file.
Write the output to a new file.
 */
public class ex45 {
    public static void main(String[] args) {

        Read_Write function = new Read_Write();

        Scanner in = new Scanner((System.in));
        System.out.print("What is the name of the file you would like to output: ");
        String name_file = in.next();

        String find = "utilize";
        function.Reading(find,name_file);

    }
}
