package ru.GeekBrains;

import java.util.Scanner;

public class Main
{
    private static Scanner scanner;


        public static void main(String[] args)
        {
            System.out.println("Ваша задача угадать число)");
            for (int i = 1; i<=3;i++)
            {
                PlayLevel();
                if (i==3)
                {
                    System.out.println("Вы проиграли((");
                }
            }

            while(true)
            {
                System.out.print("Попробовать ещё раз?" + "Да-1" + "Нет=0");
                Scanner scanner = new Scanner(System.in);
                int Answer = scanner.nextInt();
                if (Answer == 1)
                {
                    Restart();
                }
                else if (Answer==0)
                {
                    break;
                }
                else System.out.println("Вы ввели не то число");

            }

        }
    static void PlayLevel()
    {
        System.out.println("Угадайте число от 0 до 9");
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int minNumber = 0;
        int maxNumber = 9;
        int randomNumber = minNumber + (int) Math.random() * maxNumber;
        if (s < randomNumber)
        {
            System.out.println("Загаданное число больше");
        }
        else if (s>randomNumber)
        {
            System.out.println("Загаданное число меньше");
        }
        else System.out.println("Вы угадали!!!");
    }
    static void Restart()
    {
                for (int i = 1; i <= 3; i++)
                {
                    PlayLevel();
                }
    }


}
