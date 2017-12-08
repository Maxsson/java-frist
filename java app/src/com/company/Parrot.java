package com.company;

public class Parrot extends Pet{
    int KnowsTheWords;
    public Parrot (){

        this.KnowsTheWords = 0;
    }

    public Parrot(String name, float weight, int age, int KnowsTheWords)
    {
        super(name, weight,  age);
        this.KnowsTheWords = KnowsTheWords;
    }
    public void OutParrot()
    {
        OutPet();
        System.out.print(name);
        if(KnowsTheWords==0)
            System.out.println(" does not know the words");
        else
            System.out.println(" knows the words: "+KnowsTheWords);
        System.out.println();
    }
}
