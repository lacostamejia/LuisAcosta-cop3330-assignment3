package ex44_d;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

//Check this
class JSON_functionTest{
    @Test
    @DisplayName("Checking if the product is in the inventory")
    void parse() {
        String find = "Widget";
        try {
            String contents = new String((Files.readAllBytes(Paths.get("exercise44_input.json"))));
            JSONObject obj = new JSONObject(contents);
            JSONArray arr = obj.getJSONArray("products");

            for(int i = 0; i < arr.length(); i++) {
                String name = arr.getJSONObject(i).getString("name");
                Assertions.assertEquals(name, arr.getJSONObject(i).getString("name"));
                Double price = arr.getJSONObject(i).getDouble("price");
                Integer quantity = arr.getJSONObject(i).getInt("quantity");
                if(name.equals(find)){
                    System.out.printf("Name: %s\nPrice: %.2f\nQuantity: %d\n",name,price,quantity);
                }
            }
            Assertions.assertEquals(arr.getJSONObject(0).get("name"),find); //Lets check if we are able to find the object we are looking for, in the first position
        }catch (IOException | JSONException e){
            e.printStackTrace();
        }
           // System.out.println("Sorry, that product was not found in our inventory.");
    }

}