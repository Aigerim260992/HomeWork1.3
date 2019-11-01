package com.company;

import java.util.logging.SocketHandler;

public class Main {

    public static void main(String[] args) {

        String[] names = {"Aidar", "Nurgazy", "Adilhan"};

        for (String name : names) {
            switch (name) {
                case "Aidar":
                    System.out.println(name + " Доброе утро!");
                    break;
                case "Nurgazy":
                    System.out.println(name + " Доброго дня!");
                    break;
                case "Adilhan":
                    System.out.println(name + " Добрый вечер!");
                    break;


            }//sasas
        }
    }
}
