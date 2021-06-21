package ex43_d;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

//Working


class GeneratorTest {

    @Test
    @DisplayName("Checking if we are creating the folders correctly, and adding files inside them")
    void create() {

        //Used for test
        String name = "awesomeco";
        String Java = "Y";
        String CSS = "Y";

        try {
            File website = new File("website"); //Creating the website folder first.
            File name_website = new File("website/" + name); //Creating the folder for the website.

            Assertions.assertEquals("website", name_website.getParent()); //Here we are checking if the folder is being created in the correct folder.

            website.mkdir(); //Creating folder for website
            name_website.mkdir(); //Creating folder for name of the website

            File f1 = new File("website/" + name + "/index.html"); //Creating the HTML part inside the name folder
            f1.createNewFile();

            Assertions.assertEquals(name_website,f1.getParentFile());//Here we are checking if the folder is being created in the correct folder.


            System.out.println("Created ./website/"+ name);
            System.out.println("Created ./website/"+ name + "/index.html");

            if (Java.toLowerCase().equals("y")) {

                File J = new File("website/" + name + "/js");
                J.mkdir();
                System.out.println("Created ./website/"+ name + "/js");
                Assertions.assertEquals(name_website,J.getParentFile()); //Here we are checking if the folder is being created in the correct folder.
            }
            if (CSS.toLowerCase().equals("y")) {
                File CS = new File("website/" + name + "/css");
                CS.mkdir();
                System.out.println("Created ./website/"+ name + "/css");
                Assertions.assertEquals(name_website,CS.getParentFile()); //Here we are checking if the folder is being created in the correct folder.
            }


        }catch (IOException e){
            e.printStackTrace();
            System.out.println("Error");
        }
    }
}