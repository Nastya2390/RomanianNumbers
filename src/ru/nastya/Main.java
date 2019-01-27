package ru.nastya;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.ToIntFunction;

public class Main {

    public static void main(String[] args) {

        int num, input;

        if(args.length != 1) {
            System.out.println("To use this tool you should enter one parameter");
            return;
        }else{
            try {
                    num = Integer.parseInt(args[0]);
                }catch (NumberFormatException e){
                    System.out.println("Incorrect input. Try again");
                    return;
                }

            if(num > 0 & num < 4000) {
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
            }else{
                System.out.println("To use this tool you should enter the number between 1 ... 3999");
            }
        }

    }
}
