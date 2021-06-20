package ex41_d;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Read_Write {

    public static void Reading(ArrayList names){

        File MyFile = new File("exercise41_input.txt"); //Creating an object to read file
        try {
            Scanner in = new Scanner(MyFile);
            while(in.hasNextLine()){
                String name =  in.nextLine(); //Reading the line for the name
                names.add(name); //Adding the names to the list
            }
        } catch (FileNotFoundException e){ //If there was an error
            System.out.println("Error");
            e.printStackTrace();
        }
    }
    public static void Writing(ArrayList names, String design){
        //Now we are going to export the list into a new file
        try{
            FileWriter Output = new FileWriter("exercise41_output.txt"); //Here we are assigning the file where we are going to write
            Output.write("Total of " + names.size() + " names"); //Printing the total of names which is the size of the list created
            Output.write("\n" + design + "\n"); //Printing design
            Collections.sort(names); //It is sorted. //Here we are calling collections to sort the list
            for(int i = 0; i < names.size(); i++)
            {
                Output.write((String) names.get(i)); //Writing back the files.
                Output.write("\n");
            }
            Output.close();

        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
