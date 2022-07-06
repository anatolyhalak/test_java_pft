package ru.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[] agrs) {
        String somebody = " world";
        System.out.println("Hello," + somebody + "!");

        double l = 8; //литеральные значения - явно описаны в коде программы
        double s = l * l; //вычислимые значения - результат арифметической операции
        System.out.println("Площадь квадрата со стороной " + l + " = " + s);
    }
}