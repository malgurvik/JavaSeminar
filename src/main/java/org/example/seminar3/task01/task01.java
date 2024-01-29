package org.example.seminar3.task01;


// 1.	Даны сведения об экспортируемых товарах: указывается наименование товара, страна,
// экспортирующая товар, и объем поставляемой партии в штуках. Найти страны, которые
// экспортируют данный(введенный с кл-ы) товар, и общий объем его экспорта.

import java.util.ArrayList;
import java.util.Scanner;

public class task01 {
    public static void main(String[] args) {
        Item item1 = new Item("logka","ru",10000);
        Item item2 = new Item("vilka","ru",10000);
        Item item3 = new Item("nog","ru",10000);
        Item item4 = new Item("vilka","en",9000);
        Item item5 = new Item("nog","en",129000);
        ArrayList<Item> itemList = new ArrayList<>();
        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);
        itemList.add(item4);
        itemList.add(item5);

        Scanner scanner = new Scanner(System.in);
        String search = scanner.nextLine();

        ArrayList<String> country = new ArrayList<>();
        Integer sumVolume = 0;
        for (Item elem : itemList) {
            if(elem.getName().equals(search)){
                sumVolume+= elem.getVolume();
                country.add(elem.getCountry());
            }
        }
        System.out.println(sumVolume);
        System.out.println("country = " + country);
    }
}

