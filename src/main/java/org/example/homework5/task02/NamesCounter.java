package org.example.homework5.task02;

import java.util.HashMap;

class NamesCounter {
    private final HashMap<String, Integer> names = new HashMap<>();
    public void addName(String name){
        names.putIfAbsent(name, 0);
        names.put(name, names.get(name)+1);

    }
    public void showNamesOccurrences(){
        System.out.println(names);
    }
}
