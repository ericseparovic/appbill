package org.ericseparovic.appbill.model;

import java.util.Date;

public class Bill {
    private int idBill;
    private String description;
    private Date date;
    private Client client;
    private ItemBill[] itemsBill;
    private int indexItems;
    private static final int MAX_ITEMS = 10;
    private static int lastId;


    public Bill(String description, Client client){
        this.description = description;
        this.client = client;
        this.itemsBill = new ItemBill[MAX_ITEMS];
        this.idBill = ++lastId;
        this.date = new Date();
    }

    public int getIdBill() {
        return idBill;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public ItemBill[] getItemBill() {
        return itemsBill;
    }


    public void addItemBill(ItemBill itemBill){
        if(indexItems < MAX_ITEMS){
            this.itemsBill[indexItems++] = itemBill;
        }
    }
}
