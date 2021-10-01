package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        maxPerson(24,30);
        bigApple();
        maxPerson(20,28);
        bigApple();
        maxPerson(45,25);
        bigApple();
        maxPerson(10,-5);
        bigRun();
        maxPerson(11,-6);
        bigRun();



    }
    public static void maxPerson(int age,int temperature) {
        System.out.println(age);
        System.out.println(temperature);

    }public static void bigApple(){
        System.out.println("можете идти гулять");

    }


    public static void bigRun(){
        System.out.println("оставайтесь дома");

    }

}

