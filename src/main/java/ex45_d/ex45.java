package ex45_d;

import java.util.Scanner;

/*
Pseudocode
We have to read all the document, find for the word, and .replaceAll it with a new word
Then we are going to ask the user for a name to output the file, and we are going to output this file.

We have to read each line, and we are going to be adding each line to the string past_text; then
we are going to use the function .replaceAll for the string to switch the utilize word with use
Then we are going to write back with the name of the file that we would like to name our output file.
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
