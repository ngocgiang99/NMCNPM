/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entity.myentity;

import java.util.ArrayList;
import java.util.HashMap;
import model.entity.Entity;

/**
 *
 * @author truon
 */
public class Cart extends Entity{
    private int id, userID;
    private HashMap<Integer, OrderProduct> hm_order;
    static private int numberCart;
    
    Cart() {
        super();
        ++numberCart;
        id = numberCart;
    }

    public HashMap<Integer, OrderProduct> getHm_order() {
        return hm_order;
    }

    public void setHm_order(HashMap<Integer, OrderProduct> hm_order) {
        this.hm_order = hm_order;
    }

    public int getId() {
        return id;
    }


    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
    
    public void addOrder(Product product, int quantity) {
        OrderProduct order = new OrderProduct();
        order.setProductID(product.getProduct_id());
        order.setQuantity(quantity);
        hm_order.put(order.getOrderID(), order);
    }
 
    public void replaceOrderQuantity(int order_id, int nbChange) {
        OrderProduct newOrder = hm_order.get(order_id);
        newOrder.setQuantity(newOrder.getQuantity() + nbChange);
        hm_order.replace(order_id, newOrder);
    }
    
}
