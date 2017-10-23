/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg305;
import java.io.IOException;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONArray;

/**
 *
 * @author Raymond
 */
public class laureates {
    int id;
    String firstname;
    String surname;
    String motivation;
    int share;
    
    public laureates(JSONObject laureates)throws IOException, JSONException{
        id = laureates.getInt("id");
        firstname = laureates.getString("firstname");
        surname = laureates.getString("surname");
        try{
            motivation = laureates.getString("motivation");
        }catch(JSONException e){
                motivation = "N/A";
                }
        share = laureates.getInt("share");
    }
    
    public void printlaureate(){
        System.out.println("id: "+id);
        System.out.println("firstname: "+firstname);
        System.out.println("surname: "+surname);
        System.out.println("motivation: "+motivation);    
        System.out.println("share: "+share);        
    }
}
