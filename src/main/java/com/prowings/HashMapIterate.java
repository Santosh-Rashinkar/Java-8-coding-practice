package com.prowings;

import java.util.HashMap;
import java.util.Map;

public class HashMapIterate {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("Santosh",10);
        map.put("Sanjay",20);
        map.put("Sai",30);
        map.put("Gaurav",40);
        map.put("Shree",50);

        map.entrySet().stream()
                .forEach(entry ->{ System.out.println(entry.getKey() + " -> " + entry.getValue());
        });
    }
}