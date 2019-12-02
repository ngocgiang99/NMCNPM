/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.database;

import java.util.ArrayList;
import java.util.HashMap;


public class MySQLConnector implements IConnector {
    
    @Override
    public ArrayList<HashMap<String, String>> getData(String command) {
        ArrayList<HashMap<String, String>> ahm = new ArrayList<HashMap<String, String>>();
        
        return ahm;
    }
    
    @Override
    public boolean updateData(String command) {
        
        return true;
    }
    
    
    private HashMap<String, String> transformToHashMap() {
        HashMap<String, String> hm = new HashMap<String, String>();
        
        return hm;
    }
    
    
}
