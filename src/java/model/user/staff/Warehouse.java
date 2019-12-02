/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.user.staff;

import java.util.HashMap;
import model.entity.myentity.Product;
import model.entity.myentity.ProductQuantity;


public class Warehouse {
    HashMap<Integer, Product> productManager;
    HashMap<Integer, ProductQuantity> productQuantityManager;
    
    Warehouse() {
        productManager = new HashMap<Integer, Product>();
        productQuantityManager = new HashMap<Integer, ProductQuantity>();
    }
    
    /**
     *
     * @param product
     * @return true if add product successful, otherwise return false.
     * @throws java.lang.Exception
     */
    public boolean addProduct(Product product) throws Exception {
        if (product == null) {
            return false;
        }
        
        int id = product.getProduct_id();
        
        if (productManager.containsKey(id) == true) {
            ProductQuantity newQuantity = productQuantityManager.get(id);
            newQuantity.setQuantity(newQuantity.getQuantity() + 1);
            replaceProductQuantity(newQuantity);
            return true;
        }
        
        productManager.put(id, product);
        ProductQuantity quantity = new ProductQuantity();
        quantity.setProductID(id);
        quantity.setQuantity(1);
        productQuantityManager.put(id, quantity);
        return true;
    }
    
    public Product getProduct(int product_id) throws Exception {
        if (productManager.containsKey(product_id) == false) {
            throw new Exception("Warehouse not contains product");
        }
        if (productQuantityManager.get(product_id).getQuantity() == 0) {
            throw new Exception("Product out of stocks");
        }
        return productManager.get(product_id);
    }
    
    public void replaceProduct(Product newProduct) throws Exception {
        if (newProduct == null) {
            throw new Exception("New product is null");
        }
        productManager.replace(newProduct.getProduct_id(), newProduct);
    }
    
    public void replaceProductQuantity(ProductQuantity newProductQuantity) throws Exception {
        if (newProductQuantity == null) {
            throw new Exception("New product is null");
        }
        productQuantityManager.replace(newProductQuantity.getProductID(), newProductQuantity);
    }
    
    public boolean hasEnoughProduct(int product_id, int quantity) {
        return productQuantityManager.get(product_id).getQuantity() >= quantity;
    }
    
}
