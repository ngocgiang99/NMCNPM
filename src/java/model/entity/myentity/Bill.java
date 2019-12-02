/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entity.myentity;

import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.entity.Entity;
import model.user.staff.Warehouse;

/**
 *
 * @author truon
 */
public class Bill extends Entity{
    private double cost, discount, costBeforeDiscount;
    private String descripton;

    
    public double getCostBeforeDiscount() {
        return costBeforeDiscount;
    }
    
    public double getCost() {
        return cost;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getDescripton() {
        return descripton;
    }

    public void setDescripton(String descripton) {
        this.descripton = descripton;
    }
    
    public void calculateCostWithHashMapOrder(HashMap<Integer, OrderProduct> hm_order, Warehouse warehouse) throws Exception {
        cost = 0.0;
        for (OrderProduct order : hm_order.values()) {
            Product product = warehouse.getProduct(order.getProductID());
            cost = product.getPrice() * order.getQuantity();

        }
        costBeforeDiscount = cost * (1.0 - discount);
    }
    
    public void calculateCostWithSingleOrder(OrderProduct order, Warehouse warehouse) throws Exception {
        cost = 0.0;
        Product product = warehouse.getProduct(order.getProductID());
        cost = product.getPrice() * order.getQuantity();
        costBeforeDiscount = cost * (1.0 - discount);
    }
}
