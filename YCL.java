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
public class YCL {
    private int year;
    private String category;
    private ArrayList<laureates> listoflaureates = new ArrayList<laureates>();
    
    public YCL(JSONObject json)throws IOException, JSONException{
        
        year = json.getInt("year") ;
        category = json.getString("category");
        JSONArray laureatelist = json.getJSONArray("laureates");
        for (int i = 0 ; i<laureatelist.length() ; i++){
            JSONObject laureateobj = laureatelist.getJSONObject(i);
            laureates laureate = new laureates(laureateobj);
            listoflaureates.add(laureate);
        }
    }
    
    public void printYCL(){
        System.out.println("year: "+year);
        System.out.println("category: "+category);
        for(int i = 0; i<listoflaureates.size(); i++){
            listoflaureates.get(i).printlaureate();
        }
    }
    
}
