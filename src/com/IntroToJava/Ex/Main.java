package com.IntroToJava.Ex;

public class Main {

    public static void main(String[] args) {
	//1.1  Printati "Hwllo" in consola, iar pe rand nou, numele vostru
        System.out.println("Hello");
        System.out.println("Ioana Rebrisorean");

     //1.2 Printati rezultatul sumei a doua nr(orice nr)
        System.out.println("7 + 8 = " + (7 + 8));
        int a = 7;
        int b = 10;
        int sum = a + b;
        System.out.println("a + b = " + sum);

    //1.3 Printati rezultatul impartirii a doua numere
        System.out.println( 7f / 8f);

     //1.4 Printati rezultatul urmatoarelor operatiuni:
        System.out.println( "-5 + 8 * 6 = " + ( -5 + 8 * 6 ) );
        System.out.println( "( 55 + 9 ) % 9 = " + ( ( 55 + 9 ) % 9 ) );
        System.out.println( "20 + -3 * 5 / 8 = "  + ( 20 + -3 * 5f / 8f ) );
        System.out.println( " 5 + 15 / 3 * 2 - 8 % 3 = " + ( 5 + 15f / 3f * 2 - 8 % 3 ));

    //Intro To Java 2

    //2.1 Pentru exercitiile de mai sus, creati metode si apelati-le in main
        printHello();
        printName();
        sum();
        division();
        exercices();

     //2.2 Scrieti o metoda java pentru fiecare din urmatoarele operatii: adunare, scadere, inmultire, impartire. Fiecare metoda primeste 2 parametrii, efectueaza operatia si returneaza rezultatul
        System.out.println( "a + b = " + add(5,6));
        System.out.println(" a - b = " + diff(5,6));
        System.out.println( " a * b = " + multiply(5,6));
        System.out.println( " a /b = " + div(5,6));

    //2.3 Scrieti o metoda java care sa primeasca 3 parametrii si sa afiseze media
        System.out.println( " Average = " + average(3,4,5));

    //2.4 Scrieti o metoda java care sa afiseze restul impartirii a doua numere
        System.out.println(" Modulo = " + modulo(7, 9));

    //2.5 Scrieti o metoda java care sa primeasca ca si parametru un numar care reprezinta temperatura in Fahrenheit si sa returneze temperatura in Celsius (formula de calcul este: C= 5/9 * (F-32)
        System.out.println(" The temperature is: " + temperature(1));

    }


    //2.1
    public static void printHello(){
        System.out.println("Hello");
    }

    public static void printName(){
        System.out.println("Ioana Rebrisorean");
    }

    public static void sum(){
        int a = 5;
        int b = 6;
        int sum = a + b;
        System.out.println("5 + 6 = " + sum);
    }

    public static void division(){
        System.out.println( "6 / 7 = " + ( 6f / 7f ));
    }

    public static void exercices(){
        System.out.println( "-5 + 8 * 6 = " + ( -5 + 8 * 6 ) );
        System.out.println( "( 55 + 9 ) % 9 = " + ( ( 55 + 9 ) % 9 ) );
        System.out.println( "20 + -3 * 5 / 8 = "  + ( 20 + -3 * 5f / 8f ) );
        System.out.println( " 5 + 15 / 3 * 2 - 8 % 3 = " + ( 5 + 15f / 3f * 2 - 8 % 3 ));
    }

    //2.2
    public static int add(int number1, int number2){
        int add = number1 + number2;
        return add;
    }

    public static int diff(int number1, int number2){
        int diff = number1 - number2;
        return diff;
    }

    public static int multiply(int number1, int number2){
        int multiply = number1 * number2;
        return multiply;
    }

    public static float div(int number1, int number2){
        float div = (float) number1 / (float) number2;
        return div;
    }

    //2.3
    public static float average(float number1, float number2, float number3){
        float average = ( number1 + number2 + number3 ) / 3f;
        return average;
    }

    //2.4
    public static int modulo(int number1, int number2){
        int modulo = number1 % number2;
        return modulo;
    }

    //2.5
    public static float temperature(int fahrenheit){
        float celsius = 5f / 9f * (fahrenheit - 32);
        return celsius;

    }
}

