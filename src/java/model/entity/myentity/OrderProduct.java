
package model.entity.myentity;

public class OrderProduct extends ProductQuantity{
    private int orderID;
    static private int numberOrder;
    
    OrderProduct() {
        super();
        ++numberOrder;
        orderID = numberOrder;
    }

    public int getOrderID() {
        return orderID;
    }
}
