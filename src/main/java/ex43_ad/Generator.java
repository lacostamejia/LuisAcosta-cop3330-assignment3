package ex43_ad;

import java.io.File;
import java.io.IOException;

public class Generator {

    public void Create(String name, String author, String Java, String CSS) {

        try {
            File website = new File("website"); //Creating the website folder first.
            File name_website = new File("website/" + name);

            website.mkdir(); //Creating folder for website
            name_website.mkdir(); //Creating folder for name of the website

            File f1 = new File("website/" + name + "/index.html"); //Creating the HTML part inside the name folder
            f1.createNewFile();


            System.out.println("Created ./website/"+ name);
            System.out.println("Created ./website/"+ name + "/index.html");

            if (Java.toLowerCase().equals("y")) {
                File J = new File("website/" + name + "/js");
                J.mkdir();
                System.out.println("Created ./website/"+ name + "/js");
            }
            if (CSS.toLowerCase().equals("y")) {
                File CS = new File("website/" + name + "/css");
                CS.mkdir();
                System.out.println("Created ./website/"+ name + "/css");
            }


        }catch (IOException e){
            e.printStackTrace();
            System.out.println("Error");
        }

    }
}
