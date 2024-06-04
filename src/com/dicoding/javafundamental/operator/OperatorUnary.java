package com.dicoding.javafundamental.operator;

public class OperatorUnary {
    public static void main(String[] args) {
        System.out.println("Operator Unary Plus");
        int nilaiAwal = 2;
        int hasil = +nilaiAwal;
        System.out.println("Hasil +2 = " + hasil);
        System.out.println();

        System.out.println("Operator Unary Minus");
        int nilaiAwal2 = 5;
        int hasil2 = -nilaiAwal2;
        System.out.println("Hasil -5 = " + hasil2);
        System.out.println();

        System.out.println("Operator peningkatan nilai sebesar 1 point");
        int nilaiAwal3 = 3;
        int hasil3 = ++nilaiAwal3;
        System.out.println("Hasil ++3 = " + hasil3);
        System.out.println();

        System.out.println("Operator pengurangna nilai sebesar 1 point");
        int nilaiAwal4 = 4;
        int hasil4 = --nilaiAwal4;
        System.out.println("Hasil --4 = " + hasil4);
        System.out.println();

        System.out.println("Operator komplemen logika");
        boolean sukses = false;
        System.out.println("Hasil !false = " + !sukses);
        System.out.println();
    }
}
