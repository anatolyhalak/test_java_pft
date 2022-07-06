package ru.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[] agrs) {
        System.out.println("Hello," +  "world!");

        int l = 8; //литеральные значения - явно описаны в коде программы
        int s = l * l; //вычислимые значения - результат арифметической операции
        System.out.println("Площадь квадрата со стороной " + l + " = " + s);
    }
}