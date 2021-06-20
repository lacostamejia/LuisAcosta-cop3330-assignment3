package ex46_d;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Read_Count {

    public static void Solution(Map map){
        String sentence = "";
        String saved = "";
        String [] bank_words = new String[0];

        int counter = 0; //Used to count the occurrences of a word

        try{
            BufferedReader br = new BufferedReader(new FileReader("exercise46_input.txt")); //Reading
            sentence = br.readLine(); //Reading that line.
            while (sentence != null) //While it reaches the last sentence
            {
                saved = saved.concat(sentence) + " "; //Saving all them in a string
                System.out.println(sentence);
                sentence = br.readLine();
            }
            System.out.println(" ");
            //Now let's convert each word of the string into an array of words //Working!
            bank_words = saved.split("\\W+");

            //Here we are doing two for loops to iterate each word to the other words in the same array.
            for(int i = 0; i < bank_words.length; i++){
                for(int j = 0; j < bank_words.length; j++){
                    if(bank_words[i].equals(bank_words[j])){
                        //We just found one ; so let's count it
                        counter++;
                    }
                }
                map.put(bank_words[i],counter); //Working , we are using maps since the keys are original, and the values can override; so we obtain the max count always for that exact key.
                    counter = 0;
            }

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public void Order(Map map, TreeMap sorted_map){
        sorted_map.putAll(map); //We are storing in a treemap; since these ones are ordered automatically.

        String star = "*";

        for (int i = 0; i < sorted_map.size(); i++){

            String repeated = star.repeat((Integer) new Vector (sorted_map.values()).get(i)); //Getting a string with the amount of value in stars quantity.
            String word = (String) new Vector(sorted_map.keySet()).get(i);
            System.out.format("%s:%-10s%n",word, repeated); //Check this printing.
            System.out.println(" ");
        }
    }
}
