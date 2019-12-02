/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.servlet;


import model.entity.myentity.Cart;
import model.entity.myentity.Product;
import model.user.User;

/**
 *
 * @author truon
 */
public class AddProductServlet implements IServlet{

    @Override
    public void doPost() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void doGet() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private boolean addProductToCart() {
        
        return true;
    }
    
    private Cart getCart(User user) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    private Product getProduct(int productID) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
