package org.ya.lessons2.homework;

public class Lot {
//    Lot: serialKey(long), sku(Sku), quantity(long)
    private long serialKey;
    private Sku sku;
    private long quantity;

    public Lot(long serialKey, Sku sku, long quantity){
this.serialKey = serialKey;
        this.quantity = quantity;
        this.sku = sku;
    }

    public long getSerialKey() {
        return serialKey;
    }
    public void setSerialKey(long serialKey) {
        this.serialKey = serialKey;
    }

    public Sku getSku() {
        return sku;
    }
    public void setSku(Sku sku) {
        this.sku = sku;
    }

    public long getQuantity() {
        return quantity;
    }
    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }
}
