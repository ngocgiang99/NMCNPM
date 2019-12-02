/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.database;

import java.util.ArrayList;
import java.util.HashMap;

public interface IConnector {
    abstract ArrayList<HashMap<String, String>> getData(String command);
    abstract boolean updateData(String command);
}
