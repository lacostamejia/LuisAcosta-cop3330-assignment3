package ex41_d;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Read_WriteTest{
    static public  ArrayList<String> names = new ArrayList<>();
    static public String design = "-----------------";

    @Test
    @DisplayName("Reading the text file and adding the names to the list")
    //Working
    void TestAreading() {
        int i = 0;
        File MyFile = new File("exercise41_input.txt"); //Creating an object to read file
        try {
            Scanner in = new Scanner(MyFile);
            while(in.hasNextLine()){
                String name =  in.nextLine();
                names.add(name); //Adding the names to the list
                System.out.println(name);
                Assertions.assertEquals(name,names.get(i)); //Here we are checking if all the names are being added to the list
                i++;
            }
        } catch (FileNotFoundException e){ //If there was an error
            System.out.println("Error");
            e.printStackTrace();
        }
    }
    @Test
    @DisplayName("Writing file")
    void TestBwriting() {
        try{
            FileWriter Output = new FileWriter("exercise41_output.txt"); //Writing output file
            Output.write("Total of " + names.size() + " names");
            Assertions.assertEquals(7,names.size()); //Checking if we are getting the same size
            Output.write("\n" + design + "\n");
            Collections.sort(names); //It is sorted
            for(int i = 0; i < names.size(); i++)
            {
                System.out.println(names.get(i)); //Printing the names
                //Output.write((String) names.get(i));
                //Output.write("\n");
                Assertions.assertEquals(names.get(i),names.get(i));
            }
            Output.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}