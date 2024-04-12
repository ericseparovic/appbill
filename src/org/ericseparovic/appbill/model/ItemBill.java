package org.ericseparovic.appbill.model;

public class ItemBill {
    
    private int amount;
    private Product product;

    public void setAmount(int amount){
        this.amount = amount;
    }

    public int getAmount(){
        return amount;
    }

    public void setProduct(Product product){
        this.product = product;
    }

    public Product getProduct(){
        return product;
    }
}
