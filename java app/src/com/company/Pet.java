package com.company;

public class Pet {
    String name;
    float weight;
    int age;
    public Pet(){
        this.name = "?";
        this.weight = 0;
        this.age = 0;
    }
    public Pet(String name, float weight, int age)
    {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }
    public void OutPet(){
        System.out.println("Name is " +name);
        System.out.println("Weight is "+ weight);
        System.out.println("Age: " +age);
    }

}
