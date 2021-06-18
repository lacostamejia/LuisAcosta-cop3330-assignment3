package ex41_d;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Read_Write {
    public void Reading(ArrayList names){

        File MyFile = new File("exercise41_input.txt"); //Creating an object to read file
        try {
            Scanner in = new Scanner(MyFile);
            while(in.hasNextLine()){
                String name =  in.nextLine();
                System.out.println(name);
                names.add(name); //Adding the names to the list
            }
        } catch (FileNotFoundException e){ //If there was an error
            System.out.println("Error");
            e.printStackTrace();
        }
    }
    public  void Writing(ArrayList names, String design){
        //Now we are going to export the list into a new file
        try{
            FileWriter Output = new FileWriter("exercise41_output.txt");
            Output.write("Total of " + names.size() + " names");
            Output.write("\n" + design + "\n");
            for(int i = 0; i < names.size(); i++)
            {
                Output.write((String) names.get(i));
                Output.write("\n");
            }
            Output.close();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
