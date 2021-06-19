package ex44_ad;

import java.io.IOException;
import java.util.Scanner;


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
            lol = parse.Parse(name);

        }

    }
}
