package ru.nastya;

public class RomainanNumber {

    int number;
    private String res;
    String x;
    String y;
    String z;

    public RomainanNumber(int inputNumber)   {
        number = inputNumber;
        res = "";
        x = "";
        y = "";
        z = "";
    }

    public String resStr(){
        return res;
    }

    public void setRes(String str){
        res = str;
    }


    public void getResults(String x, String y, String z, Integer number){
        switch (number){
            case 1:
                setRes(resStr() + x);
                break;
            case 2:
                setRes(resStr() + x + x);
                break;
            case 3:
                setRes(resStr() + x + x + x);
                break;
            case 4:
                setRes(resStr() + x + y);
                break;
            case 5:
                setRes(resStr() + y);
                break;
            case 6:
                setRes(resStr() + y + x);
                break;
            case 7:
                setRes(resStr() + y + x + x);
                break;
            case 8:
                setRes(resStr() + y + x + x + x);
                break;
            case 9:
                setRes(resStr() + x + z);
                break;
            default:
                throw new IllegalArgumentException("Number from 1 to 9");
        }
    }

}
