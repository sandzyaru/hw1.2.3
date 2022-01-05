package com.company;

public class GrandFather {
    private String name;
    private int age;
    private Skin skin;



    public GrandFather(String name , int age, Skin skin){
        this.name=name;
        this.age=age;
        this.skin=skin;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Skin getSkin() {
        return skin;
    }
    public String getInfo() {
        return "Age: " + age +
                "\nSkin: " + skin+
                "\nName: " + name;
    }
}
