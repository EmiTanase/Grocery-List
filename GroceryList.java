package com.company;

import java.util.ArrayList;

public class GroceryList {
    private  ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }
    // in metoda asta afisam ce elemente avem in lista sub forma 1.element, 2.element, de aia am pus (i+1) + "."
    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for(int i = 0; i < groceryList.size(); ++i) {
            System.out.println((i+1) + "." + groceryList.get(i));
        }
    }
    // introducem pozitia in care vrem sa modificam elementul si scriem cu ce element vrem sa inlocuim
    public void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position+1) + " has been modified");
    }
    public void removeGroceryItem(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }
    public String findItem(String searchItem) {
       // boolean exists = groceryList.contains(searchItem); // daca gaseste elementul introdus ca parametru = true
        int position = groceryList.indexOf(searchItem); // returneaza pozitia pe care se gaseste elementul cautat
        if(position >= 0) {
            return groceryList.get(position);
        }
        return null; // nu am gasit elementul pt ca returneaza -1, asa ca returneaza null

    }

}
