package com.company;

public class Cat extends Pet {
    boolean CanCatches = false;
    int Catched = 0;
    public Cat(){
        this.CanCatches = false;
        this.Catched = 0;
    }
    public Cat (String name, float weight, int age, boolean CanCatches, int Catched)
    {
        super(name, weight,  age);
        this.CanCatches = CanCatches;
        this.Catched = Catched;
    }
    public void OutCat(){
        OutPet();
        if(CanCatches==true)
            System.out.println("Catched mise: " +Catched);
        else
            System.out.println("Can not catch mice" );
        System.out.println();
    }
}
