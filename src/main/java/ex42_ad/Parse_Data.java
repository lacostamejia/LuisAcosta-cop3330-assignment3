package ex42_ad;

import java.io.*;

public class Parse_Data {

    public void Solution(String line, String data[]){
        try{
            BufferedReader br = new BufferedReader(new FileReader("exercise42_input.txt"));
            while((line = br.readLine()) != null){
                data = line.split(",");

                //Output printing with the format.
                System.out.format("%-10s%-10s%-10s%n", data[0],data[1],data[2]);
            }
            
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
