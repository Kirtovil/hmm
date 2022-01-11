package com.company;

public class Main {

    public static void main(String[] args) {


        int a = 1;
        while (a <= 10) {
            System.out.print(a + " ");
            a++;
        }
        System.out.print("\n");
        for (int b = 10; b >= 1; b = b - 1) {
            System.out.print(b + " ");
        }

        System.out.print("\n");
        int friday = 4;
        for ( ; friday <= 31; friday = friday + 7) {
            System.out.println("Сегодня пятница " + friday + "-е число. Необходимо подготовить отчёт.");
        }


        int cometYear = 0;
        int startYear = 1822;
        int finishYear = 2122;
        for ( ; cometYear <= finishYear; cometYear = cometYear + 79) {
            if (cometYear >= startYear) {
            System.out.println(cometYear);}

        }
    }
}
