package com.company;

import java.util.ArrayList;

public class Main {

    private static ArrayList<Worker> workers = new ArrayList<Worker>();

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i < 5) {
                workers.add(new Engeneer("Alexandr Mark Taylor", "bachelor", 6, 4, 9));
                workers.get(i).print();
            } else {
                workers.add(new Director("John Stark Snow", "magister", 5, "Human Resources", "21.03.2010"));
                workers.get(i).print();
            }
        }
    }
}
