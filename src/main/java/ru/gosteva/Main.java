package ru.gosteva;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        boolean flag = true;
        flag = false;

    // Целочисленные типы данных
        byte aByte = -128; // -128 ... 127 (8 bit)
        aByte = (byte) (aByte + 1);
        short aShort = -32768; // -32768 ... 32767 (16 bit)

    // Используем*
        int aInt = -2147463; // 32 bit  2^(bit-1)
        long aLong = -2147463L; // 64 bit

    // Типы данных с плавающей точкой
        float aFloat = 0F; // 32 bit
    // Используем
        double aDouble = 0D; // 64 bit

    // Символ
        char aChar = '0';

    // Операторы
    // 1. Присвоение
        char bChar = 'a';
    // 2. Математические + - * / %
        int result = 5 + 3;
        int result2 = 5 / 2;
        int result3 = 5 % 2;
        System.out.println("### result: " + result );
        System.out.println("### result2: " + result2);
        System.out.println("### result3: " + result3);

    // 3. Операторы сравнения >, <, >=, <=, !=, ==
        System.out.println("### boolean result: " + (3 <= 2));

        String f = "this is a String";
        List<String> aList = new ArrayList<>();
        List aLists = new ArrayList<>();
        List<Integer> aListss = new ArrayList<>();

    // 4. Логические операторы &(И) && (сокращенное И), | (ИЛИ) || (сокращенное ИЛИ), отрицание (! НЕ)
        String s = null;
        if (s!=null && s.length()==3); {
            System.out.println("true");
        }

        if (3>2 || 3<10); {
            System.out.println("true");
        }

        if (!(3>2 || 3>10)); {
            System.out.println("false");
        }

        if (methodOne() | methodAnother()) {
            System.out.println("");
        }

    // 5. Тернарный оператор
        int value = (methodOne())
                ? 10
                : 20;
        System.out.println("### value: " + value);

        int value1;
        if (methodOne()) {
            value1 = 10;
        } else {
            value1 = 20;
        }
        System.out.println("### value1: " + value1);

    // 6 instanceof
        if (s instanceof String) {
        }
        System.out.println("### sting: " + s);
        System.out.println("Hello world!");

    // Wrapper types
        Integer aIntegerWrapper;// int
        Double aDoubleWrapper;
        Character aCharWrapper; // char

        int arg = 42; // также можно Integer arg = 42;
        printInt(arg);

        switch (s) {
            case "dima": {
                System.out.println("Thats Dima");
            }
            case "vasya": {
                System.out.println("Thats Vasya");
            }
        }

        switch (s) {
            case "dima": {
                System.out.println("Thats Dima");
                break;
            }
            case "vasya": {
                System.out.println("Thats Vasya");
            }
            default: {
                System.out.println("Default");
            }
        }

        if (s.equals("dima")) {
            System.out.println("Thats Dima");
        } else if (s.equals("vasya")) {
            System.out.println("Thats Vasya");
        } else {
            System.out.println("Default");
        }

    }

    public static boolean methodOne() {
        System.out.println("methodOne");
        return false;
    }
    public static boolean methodAnother() {
        System.out.println("methodAnother");
        return true;
    }

    public static void printInt(int arg){
        System.out.println("### printInt: " + arg);
    }
}