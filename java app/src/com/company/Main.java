package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Dog Mops= new Dog("Kot",25.1f, 10, false);
	Cat Murzik= new Cat ("Murzik",7f,2,true,5);
	Parrot Kescha = new Parrot ("Kescha",1.3f,3,73);

	Dog WTF1 = new Dog();
	Cat WTF2 = new Cat();
	Parrot WTF3 = new Parrot();

	Mops.OutDog();
	Murzik.OutCat();
	Kescha.OutParrot();

	WTF1.OutDog();
	WTF2.OutCat();
	WTF3.OutParrot();
    }
}
