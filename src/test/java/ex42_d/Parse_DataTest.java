package ex42_d;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class Parse_DataTest {

    @Test
    @DisplayName("Testing to check if the parsing is being correct and reading")
    void solution() {
        String line = "";
        String [] data = new String[0];
        try{
            BufferedReader br = new BufferedReader(new FileReader("exercise42_input.txt"));
            while((line = br.readLine()) != null){
                data = line.split(",");
                //Output printing with the format.
                System.out.format("%-10s%-10s%-10s%n", data[0],data[1],data[2]);

            }
            Assertions.assertEquals("Zarnecki",data[0]); //This is the last name in the table

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}