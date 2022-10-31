

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner klavye = new Scanner(System.in);
        double num1, num2;
        String islem;

        System.out.println("Birinci numarayı giriniz: ");
        num1 = klavye.nextDouble();

        System.out.println("Isleminizi seciniz: ( + , - , * , / , ^ ): ");
        islem = klavye.next();

        System.out.println("Ikinci numarayı giriniz: ");
        num2 = klavye.nextDouble();

        switch (islem) {
            case "+":
                System.out.println(num1 + num2);
                break;

            case "-":
                System.out.println(num1 - num2);
                break;

            case "*":
                System.out.println(num1 * num2);
                break;

            case "/":
                if (num2 != 0)
                    System.out.println(num1 / num2);
                else
                    System.out.println("Sayı 0 ile bölünemez, Lütfen işlemi baştan başlatınız.");
                break;

            case "^":
                System.out.println(Math.pow(num1, num2));
                break;

            default:
                System.out.println("!!! İşleminiz geçersizdir !!!!");


                // if yoluyla ugrastim olmadi, sorunu bulamadim,
            /*
            if ( islem == "+") {
                System.out.println(num1 + num2);
            } else if ( islem == "-") {
                System.out.println(num1 - num2);
            } else if (islem == "*"){
                System.out.println(num1*num2);
            } else if (islem == "/"){
                System.out.println(num1 / num2);
            }else (islem == "^"){
                System.out.println(Math.pow(num1, num2));
            }

            */
        }
    }
}