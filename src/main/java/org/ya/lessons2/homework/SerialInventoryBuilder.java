package org.ya.lessons2.homework;

public class SerialInventoryBuilder {
    private long serialKey;
    private Sku sku;
    private Lot lot;
    private Loc loc;
    private long quantity;

    public static SerialInventoryBuilder builder() {
        return new SerialInventoryBuilder();
    }
    public SerialInventoryBuilder withSerialKey(long serialKey) {
        this.serialKey = serialKey;
        return this;
    }
    public SerialInventoryBuilder withSku(Sku sku) {
        this.sku = sku;
        return this;
    }
    public SerialInventoryBuilder withLot(Lot lot) {
        this.lot = lot;
        return this;
    }
    public SerialInventoryBuilder withLoc(Loc loc) {
        this.loc = loc;
        return this;
    }
    public SerialInventoryBuilder withQuantity(long Quantity) {
        this.quantity = quantity;
        return this;
    }
    public SerialInventory build() {
        return new SerialInventory(serialKey, sku, lot, loc, quantity);
    }
}
