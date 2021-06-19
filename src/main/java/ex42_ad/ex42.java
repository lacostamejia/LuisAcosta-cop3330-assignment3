package ex42_ad;
/*
Pseudocode

1. Read file
We have to create new file object to read the file
we are going to use try and catch to check if there was an error reading the file

2. Save the information and sort it - How we are going to sort it?
we are going to save the information in some type that we can have name, last name, and salary. //Check

3. Export the information into a txt.


Constraints:
Write your own code to parse the data. Don't use a CSV parser.
 */
//Working!

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Luis Andres Acosta Mejia
 */

public class ex42 {
    public static void main(String[] args) {

        Parse_Data Obj = new Parse_Data();
        String [] data = new String[0];
        String line = "";

        System.out.println("Last      First     Salary");
        System.out.println("--------------------------");
        Obj.Solution(line, data);


    }
}
