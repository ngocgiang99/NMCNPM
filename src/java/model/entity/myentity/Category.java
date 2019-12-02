/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entity.myentity;

import model.entity.Entity;

/**
 *
 * @author truon
 */
public class Category extends Entity{
    private int categoryID;
    private String name, image;
    static private int numberCategory;

    Category() {
        super();
        ++numberCategory;
        categoryID = numberCategory;
    }
    
    public int getCategoryID() {
        return categoryID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    
}
