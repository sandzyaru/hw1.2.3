package com.company;

import java.util.Random;

public final class Son extends Father{
private int NumberOFCars=generateNumberOFCars();

    public Son(String name, int age, Skin skin, String nameOfMother, String job) {
        super(name, age, skin, nameOfMother, job);
    }

    public int getNumberOFCars() {
        return NumberOFCars;
    }


    @Override
    public String getInfo() {
        return super.getInfo()+
                "\nName: "+getNameOfMother()+
                "\nNumber of cars: "+getNumberOFCars();

    }
    private  int generateNumberOFCars (){
        Random random = new Random();
        return random.nextInt(10)+1;
    }
}
