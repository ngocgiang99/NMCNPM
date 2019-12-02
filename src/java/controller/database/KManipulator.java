/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.database;

import model.entity.Entity;
import java.util.HashMap;


public class KManipulator implements IManipulation{
    
    public String makeFetchingCommand(Entity entity) {
        String mess = "";
        
        return mess;
    }
    
    public String makeUpdateCommand(Entity entity) {
        String mess = "";
        
        return mess;
    }
    
    public Entity getEntity(String command) {
        Entity entity = new Entity();
        
        return entity;
    }
    
    public boolean updateEntity(Entity entity) {
        
        return true;
    }
    
    private Entity transformDataToEntity(HashMap<String, String> data) {
        Entity entity = new Entity();
        
        return entity;
    }
}
