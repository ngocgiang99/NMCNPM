/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.utilities;

import model.entity.Entity;

import com.google.gson.Gson;

public class CartConverter implements IConverter {
    
    @Override
    public void convertEntityToJSOn(Entity entity) {
        Gson gson = new Gson();
        gson.toJson(entity);
    }
}
