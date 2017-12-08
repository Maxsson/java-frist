package com.company;

public class Dog extends Pet {
    Boolean Hunting;
    public Dog(){
        this.Hunting = false;
    }

    public Dog (String name, float weight, int age, Boolean Hunting)
    {
        super(name, weight,  age);
        this.Hunting = Hunting;
    }
    public void OutDog(){
        OutPet();
        System.out.print(name);
        if(Hunting==true)
        System.out.println(" is hunting dog");
        else
            System.out.println(" is not hunting.");
        System.out.println();

    }
}
