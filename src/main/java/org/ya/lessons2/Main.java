package org.ya.lessons2;

import org.ya.lessons2.homework.*;

public class Main {
    public static void main(String[] args) {

        Point p = new Point();
        System.out.println(p);
        Point p1 = new Point(1, 3);
        System.out.println(p1.getX());
        System.out.println(p1.getY());
        System.out.println(p.getId());
        System.out.println(p1.getId());
        System.out.println(Point.getCounter());
        Point p3 = Point.of(5, 5);

        Point point = PointBuilder.builder()
                .withX(12)
                .withY(7)
                .build();

        Line line = Line.of(1, 3, 1, 5);

        //По 2-му ДЗ
        Sku sku = new Sku(187465, 476678, "Тестовый товар");
        Lot lot = new Lot(167627, sku, 70);
        Loc loc = new Loc(12345, "OTB-22", 10, 20, 30, 110, 120, 130, "OTB");

        SerialInventory serialInventory = SerialInventoryBuilder.builder()
                .withSerialKey(134343)
                .withSku(sku)
                .withLot(lot)
                .withLoc(loc)
                .withQuantity(30)
                .build();
        System.out.println(serialInventory);
    }
}
