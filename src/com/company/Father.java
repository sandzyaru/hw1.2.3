package com.company;

public class Father extends GrandFather{

    private String nameOfMother;
    private String job;
    public final void Father(String nameOfMother){

        this.nameOfMother=nameOfMother;
    }

    public String getNameOfMother() {
        return nameOfMother;
    }

    public String getJob() {
        return job;
    }

    public Father(String name, int age, Skin skin,String nameOfMother, String job){
        super(name,age,skin);
        this.nameOfMother=nameOfMother;
        this.job=job;

    }
    @Override
    public String getInfo() {
        return super.getInfo()+
                "\nName: "+getNameOfMother()+
                "\nAge: "+getJob();

    }
}
