package org.ya.lesson6;

import java.io.FileOutputStream;

public class Main {
    public static void writeStringLn(String data, String filePath) {
        try (FileOutputStream fos = new FileOutputStream(filePath, true)) {
            //PrintWriter pr = new PrintWriter("file.txt");
            fos.write(data.getBytes());
            fos.write('\n');
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void fillFile(String name) {
        //long start = System.currentTimeMillis();
//        byte[] array = new byte[1024];
//        for (int i = 0; i < 1024; i++) {
//            array[i] = 'a';
//        }
        try (FileOutputStream fos = new FileOutputStream(name)) {
            for (int i = 0; i < 100000; i++) {
                fos.write('a');
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        // long end = System.currentTimeMillis();
        // System.out.println("Time: " + (end - start) + " ms.");
    }
}
