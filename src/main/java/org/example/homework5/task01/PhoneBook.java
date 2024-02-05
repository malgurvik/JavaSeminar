package org.example.homework5.task01;


import java.util.ArrayList;
//import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

class PhoneBook {
    private static final HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();
    public void add(String name, Integer phoneNum){
        if (phoneBook.containsKey(name)){
            phoneBook.get(name).add(phoneNum);
        }else {
//            phoneBook.put(name, new ArrayList<>(Arrays.asList(phoneNum)));
            phoneBook.put(name, new ArrayList<>(Collections.singletonList(phoneNum)));
        }
    }
    public ArrayList<Integer> find(String name){
        if (phoneBook.containsKey(name)){
            return phoneBook.get(name);
        }else return new ArrayList<>();
    }
    public static HashMap<String, ArrayList<Integer>> getPhoneBook(){
        return phoneBook;
    }
}
