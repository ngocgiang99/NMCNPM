/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.database;

import model.entity.Entity;

public interface IManipulation {
    abstract String makeFetchingCommand(Entity entity);
    abstract String makeUpdateCommand(Entity entity);
    abstract Entity getEntity(String command);
    abstract boolean updateEntity(Entity entity);
}
