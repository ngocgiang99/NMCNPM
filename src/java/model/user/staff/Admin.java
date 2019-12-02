/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.user.staff;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.entity.myentity.Product;
import model.user.User;

/**
 *
 * @author truon
 */
public class Admin extends User {
    private Warehouse warehouse;

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }
    
    public boolean addProduct(Product product) {
        try {
            return warehouse.addProduct(product);
        } catch (Exception ex) {
            return false;
        }
    }
    
    public Product getProduct(int product_id) throws Exception {
        return warehouse.getProduct(product_id);
    }
    
    public boolean replaceCostProduct(Product product, double newPrice) {
        try {
            product.setPrice(newPrice);
            warehouse.replaceProduct(product);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
    
    public boolean hashEnoughProduct(int product_id, int quantity) {
        return warehouse.hasEnoughProduct(product_id, quantity);
    }
    
}
