package ex44_d;

import java.io.IOException;
import java.util.Scanner;
/*
Pseudocode
Fist we are going to read the JSON file; then we are going to get the "products" as an array that has some values inside.
Then, we are going to iterate the array of products, and we are going to check inside the same loop if the variable we input to find
is located inside the array of products with the key "name", String name = arr.getJSONObject(i).getString("name"); if is the same,
we are going to use the following code to check for its price
and quantity.  Double price = arr.getJSONObject(i).getDouble("price");
 */

/*
//Completed
 */

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Luis Andres Acosta Mejia
 */
public class ex44 {
    public static void main(String[] args) throws IOException {

        JSON_function parse = new JSON_function();
        Scanner in = new Scanner(System.in);
        String name;
        boolean lol = false;

        while(!lol) {
            System.out.print("What is the product name? ");
            name = in.next();
            lol = parse.Parse(name); //Checking if is true or false, in order to continue or not

        }

    }
}
