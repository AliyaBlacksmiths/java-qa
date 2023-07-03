package org.ya.lessons2.homework;

public class SerialInventory {
//    SerialInventory: serialKey(long), sku(Sku), lot(Lot), loc(Loc), quantity(long)

    private long serialKey;
    private Sku sku;
    private Lot lot;
    private Loc loc;
    private long quantity;

    public SerialInventory(long serialKey, Sku sku, Lot lot, Loc loc, long quantity){
        this.serialKey = serialKey;
        this.quantity = quantity;
        this.sku = sku;
        this.lot = lot;
        this.loc = loc;
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

    public Lot getLot() {
        return lot;
    }
    public void setLot(Lot lot) {
        this.lot = lot;
    }

    public Loc getLoc() {
        return loc;
    }
    public void setLoc(Loc loc) {
        this.loc = loc;
    }

}
