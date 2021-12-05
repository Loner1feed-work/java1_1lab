package com.company;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        Computer notebooks[] = new Computer[5];


        // filling array of classes
        for (int i = 0; i < 5; i++) {
            notebooks[i] = new Computer();
            if(i % 2 == 0) {
                notebooks[i].manufacturer = "Lenovo";
                notebooks[i].cpu = "i7-3270U";
                notebooks[i].ram = 8;
                notebooks[i].date = "13-01-2003";
            }
            else {
                notebooks[i].manufacturer = "Dell";
                notebooks[i].cpu = "i5-3270U";
                notebooks[i].ram = 4;
                notebooks[i].date = "25-04-2001";
            }
            notebooks[i].price = (int)(Math.random() * 100000);
//            notebooks[i].print();
        }


        // searching items with manufacturer "dell"
        int indexes[] = new int[5];
        int current = 0;
        for (int i = 0; i < 5; i++) {
            if (notebooks[i].manufacturer == "Dell") {
                indexes[current] = i;
                current++;

            }
        }

        // searching minimal price
        double min = notebooks[indexes[0]].price;
        int minIndex = indexes[0];
        Computer searchedItem = new Computer();
        for (int i = 0; i < current; i++) {
            if (notebooks[indexes[i]].price < min) {
                minIndex = indexes[i];
                min = notebooks[indexes[i]].price;
            }
        }
        System.out.println("Notebook Manufactured by dell with minimal price: ");
        notebooks[minIndex].print();

    }
}

class Computer{
    String manufacturer;
    String cpu;
    int ram;
    String date;
    double price;

    // methods
    void print() {
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("CPU: " + cpu);
        System.out.println("RAM: " + ram);
        System.out.println("Date of manufacturing: " + date);
        System.out.println("Price: " + price);
    }

}
