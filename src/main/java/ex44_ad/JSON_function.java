package ex44_ad;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JSON_function {

    public boolean Parse(String find) throws IOException {
        try {
            String contents = new String((Files.readAllBytes(Paths.get("exercise44_input.json"))));
            JSONObject obj = new JSONObject(contents);
            JSONArray arr = obj.getJSONArray("products");

            for(int i = 0; i < arr.length(); i++) {
                String name = arr.getJSONObject(i).getString("name");
                Double price = arr.getJSONObject(i).getDouble("price");
                Integer quantity = arr.getJSONObject(i).getInt("quantity");
                if(name.equals(find)){
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
