/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg305;

import java.util.ArrayList;

/**
 *
 * @author Raymond
 */
public class array {
    private ArrayList<YCL> Array = new ArrayList<YCL>();
    
    public void add(YCL obj){
        Array.add(obj);
    }
    
    public void print(){
        for (int i = 0; i<Array.size();i++){
            Array.get(i).printYCL();
        }
    }
}
