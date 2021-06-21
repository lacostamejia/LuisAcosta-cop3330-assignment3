package ex43_d;
/*

 */

import java.io.IOException;
import java.util.Scanner;

/*
Pseudocode
We have to use functions to create a file
first we are going to get all the information such as name, author and decisions on the main file
then we are going to create a generator class and create an object of that class inside the main class

Site name: awesomeco
Author: Max Power
Do you want a folder for JavaScript? y
Do you want a folder for CSS? y
Created ./website/awesomeco
Created ./website/awesomeco/index.html
Created ./website/awesomeco/js/
Created ./website/awesomeco/css/
//Completed
 */

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Luis Andres Acosta Mejia
 */

public class ex43 {
    public static void main(String[] args) throws IOException {

        Generator Gen = new Generator(); //Creating an object for the class to be used
        Scanner in = new Scanner(System.in);

        System.out.print("Site name: ");
        String name = in.nextLine();

        System.out.print("Author: ");
        String author = in.nextLine();
        author = author + name + "/index.html";

        System.out.print("Do you want a folder for JavaScript? ");
        String Java = in.nextLine();

        System.out.print("Do you want a folder for CSS? ");
        String CSS = in.nextLine();

        Gen.Create(name,author,Java, CSS);




    }
}
