package ex42_d;

import java.io.*;

public class Parse_Data {

    public void Solution(String line, String data[]){
        try{
            BufferedReader br = new BufferedReader(new FileReader("exercise42_input.txt")); //Here we are going to make a reader for this input file
            while((line = br.readLine()) != null){ //Here we are checking if the line is not empty or null so we continue to read
                data = line.split(","); //Here we are going to save the data by splitting and adding each value between the commas ","

                //Output printing with the format.
                System.out.format("%-10s%-10s%-10s%n", data[0],data[1],data[2]);
            }
            
        }catch (FileNotFoundException e){ //Checking for errors of not file found
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
