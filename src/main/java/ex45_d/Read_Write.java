package ex45_d;

import java.io.*;




//Completed

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Luis Andres Acosta Mejia
 */

public class Read_Write extends ex45 { //Extending to use the same variables

    public void Reading(String find,String name_file){

        String past_text = ""; //Used to save the previous text

        String new_word = ""; //Here we are going to save all the new text

        try {
            BufferedReader reader = new BufferedReader(new FileReader("exercise45_input.txt")); //Input file
            FileWriter Output = new FileWriter(name_file+".txt"); //Writing an output file with the name that we would like to.

            String word = reader.readLine(); //We are going to be reading lines

            //Reading all the lines of input text file until there isn't anymore.
            while(word != null){
                past_text = past_text + word + System.lineSeparator(); //Here we are saving all the lines of the input file in this new long string
                word = reader.readLine(); //Reading
                //Assertions.assertAll();
            }
             new_word = past_text.replaceAll(find,"use");
            //Here we are setting the new long array to be all the reading we did but then we are going to replace all this array if there is a "utilize" word with the new word "use"

            Output.write(new_word); //Here we are writing back the big array to the output file.
            Output.close(); //Closing to write; so there isn't any leak.

        } catch (IOException e){ //If there was an error
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}
