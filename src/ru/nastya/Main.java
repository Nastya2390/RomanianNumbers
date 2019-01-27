package ru.nastya;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num, input;

        do {
            do {
                System.out.println("Please, enter number between 1 and 3999, for exit press 0:");
                try {
                    num = in.nextInt();
                }catch (InputMismatchException e){
                    System.out.println("Incorrect input. Try again");
                    num = -1;
                    in.nextLine();
                    continue;
                }

                if (num == 0) {
                    break;
                }
            } while (num < 1 || num > 3999);

            if (num == 0) {
                break;
            }
            input = num;

            RomainanNumber romN = new RomainanNumber(num);

            // тысячи
            switch (num / 1000) {
                case 1:
                    romN.setRes("M");
                    break;
                case 2:
                    romN.setRes("MM");
                    break;
                case 3:
                    romN.setRes("MMM");
                    break;
            }

            num = num - (num / 1000) * 1000;

            // сотые
            romN.getResults("C", "D", "M", num / 100);
            num = num - (num / 100) * 100;

            // десятки
            romN.getResults("X", "L", "C", num / 10);
            num = num - (num / 10) * 10;

            // единицы
            romN.getResults("I", "V", "X", num % 10);

            System.out.println("You enter " + input + " in Romanian letters = " + romN.resStr() + "\n");
        } while (num != 0);

        System.out.println("Bye");
        in.close();

    }
}
