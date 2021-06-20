package ex44_d;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JSON_function {

    public boolean Parse(String find) throws IOException {
        try {
            String contents = new String((Files.readAllBytes(Paths.get("exercise44_input.json")))); //Here we are reading the json file
            JSONObject obj = new JSONObject(contents); //Here we are creating an object based on the reading of the json file we made
            JSONArray arr = obj.getJSONArray("products"); //Here we are getting the array products of the JSON

            for(int i = 0; i < arr.length(); i++) { //Here we are checking each index of the array

                String name = arr.getJSONObject(i).getString("name"); //We are getting the value inside the array with the keyword name

                Double price = arr.getJSONObject(i).getDouble("price");

                Integer quantity = arr.getJSONObject(i).getInt("quantity");

                if(name.equals(find)){
                    //If we find the exact name we are looking for, we are going to prints all its attributes such as name, price, and quantity.
                    System.out.printf("Name: %s\nPrice: %.2f\nQuantity: %d",name,price,quantity);
                    return true;
                }
            }
        }catch (IOException | JSONException e){
            e.printStackTrace();
        }
        System.out.println("Sorry, that product was not found in our inventory.");
        return false;
    }
}
