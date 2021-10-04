package com.company;

public class Main {

    public static void main(String[] args) {
	    String value = maxPerson(20, 26);
        String value1 = maxPerson(40, 7);
        String value2 = maxPerson(15, 10);
        String value3 = maxPerson(35, 26);
        String value4 = maxPerson(80, -40);
        System.out.println(value + "\n" + value1 + "\n" + value2 + "\n" + value3 + "\n" + value4);
    }
    public static String maxPerson(int age,int temperature) {

        if (age > 20 && age < 45 && temperature > -20 && temperature < 30){
            return "Можно идти гулять";
        }else if(age < 20 && temperature > 0 && temperature < 28){
            return "Можно идти гулять";
        }else if (age > 45 && temperature > -10 && temperature <20 ){
            return "Можно идти гулять";
        }else{
            return "Оставайтесь дома";
        }
    }


}

