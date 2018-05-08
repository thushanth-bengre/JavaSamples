/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Bengre
 */
public class OrderItem {
    private int salesPrice;
    private double commission;
    private boolean belowTarget;
    private boolean aboveTarget;
    private boolean onTarget;
    private int targetPrice;
    private int quantity;
    private Product p;
    
    public OrderItem(){
        belowTarget = false;
        aboveTarget = false;
        onTarget = false;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    

    public boolean isOnTarget() {
        return onTarget;
    }

    public void setOnTarget(boolean onTarget) {
        this.onTarget = onTarget;
    }
    

    public boolean isBelowTarget() {
        return belowTarget;
    }

    public void setBelowTarget(boolean belowTarget) {
        this.belowTarget = belowTarget;
    }

    public boolean isAboveTarget() {
        return aboveTarget;
    }

    public void setAboveTarget(boolean aboveTarget) {
        this.aboveTarget = aboveTarget;
    }

    public int getTargetPrice() {
        return targetPrice;
    }

    public void setTargetPrice(int targetPrice) {
        this.targetPrice = targetPrice;
    }

    public int getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(int salesPrice) {
        this.salesPrice = salesPrice;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public Product getP() {
        return p;
    }

    public void setP(Product p) {
        this.p = p;
    } 
    
}
