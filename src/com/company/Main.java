package com.company;

public class Main {

    public static void main(String[] args) {
	Father father = new Father("Bogdan",48 , Skin.LIGHT,"Alisa","Programmer");
    Son son = new Son("Alex",18,Skin.SWART,"Bermet","Manager");
    Son son1 = new Son("Aidar",25, Skin.DARK , "Zhyldyz","Waiter");
        System.out.println(father.getInfo());
        System.out.println("-------------------");
        System.out.println(son.getInfo());
        System.out.println("-------------------");
        System.out.println(son1.getInfo());
    }
}
