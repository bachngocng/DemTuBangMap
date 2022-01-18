package com.codegym;

import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        String sentence = "Great power " + "comes with " + "great responbilities";

        Map<String, Integer> treemap = new TreeMap<>();
        String[] arr = sentence.toLowerCase().split(" ");


        for (String s : arr) {
            if (treemap.containsKey(s)) {      // nếu trong map đã có key s thì tăng value lên 1
                int count = treemap.get(s);
                treemap.replace(s, count + 1);
            } else {                            // nếu chưa có thì đặt entry (s, 1) vào trong map
                treemap.put(s, 1);
            }
        }


        // in ra map
        treemap.entrySet().forEach(entry -> {
            System.out.println("Từ \"" + entry.getKey() + "\" xuất hiện " + entry.getValue() +  " lần");
        });

    }
}
