package ex46_d;

import java.util.HashMap;
import java.util.TreeMap;

/*
Pseudocode:
We are going first read the document; then we are going to read each line, and concatenate it with a " " in the middle
on the sentences. Then we are going to save each word of the sentence separately in an array/
Then we can use a for loop inside another for loop to check every single word and see if there are repetitions of the same one;
We are going count each occurrences,  and we are going to add the name of the word and the number of repetitions as key and value of a map
since we can just then transform the map into a treemap which already sorts the elements with respect to their values.
Then we can just print the TreeMap.

Ensure that the most used word is at the top of the report and the least used words are at the bottom.
 */
public class ex46 {
    public static void main(String[] args) {

        HashMap<String,Integer> map = new HashMap<String,Integer>();//Creating HashMap to save and print
        TreeMap<String, Integer> sorted_map = new TreeMap<String, Integer>();

        Read_Count MyObj = new Read_Count();
        MyObj.Solution(map);
        MyObj.Order(map, sorted_map);
    }
}
