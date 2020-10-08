package ru.GeekBrains;

import java.util.Random;
import java.util.Scanner;

public class Main
{
    static char[][] map;
    static final int SIZE = 3;
    static final int DOTS_TO_WIN =3;

    static final char DOT_EMPTY = '.';
    static final char DOT_X = 'X';
    static final char DOT_O = 'O';
    static int playersFigure = mainMenu();

    // 1. инициализировать поле
        // 1.1 Вывод поля
    // в цикле
        // 2. Выбор игральной фишки. - ДОП К ДЗ
        // 3. Ход первого игрока.
        // 4. Вывод поля.
        // 5. Проверка на 3 в ряд и диагональ.
        // 6. Проверка на ничью.
        // 7. Ход второго игрока (ИИ).
        // 8. Вывод поля.
        // 9. Проверка на 3 в ряд и диагональ.

    public static void main(String[] args)
    {
        String name1;
        String name2;
        if (playersFigure == 1)
        {
            name1 = "человек";
            name2 = "Искусственный интеллект";
        }
        else
            {
                name1 ="искусственный интеллект";
                name2 = "человек";
            }
        initMap();
        printMap();
        while (true)
        {
            playerTurn();
            printMap();
            if (playersFigure == 1)
            {
                System.out.println("Победил " + name1);
                break;
            }

            if (isMapFull())
            {
                System.out.println("Ничья");
                break;
            }
            AI_Turn();
            printMap();
            if (hasWin(DOT_O))
            {
                System.out.println("Победил "+ name2);
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }


    }
    static void initMap() //инициализация поля
    {
        map = new char[SIZE][SIZE];

        for (int i = 0; i < map.length; i++)
        {
            for (int j = 0; j < map[i].length; j++)
            {
                map[i][j] = DOT_EMPTY;
            }
        }

    }

    static void printMap() //вывод поля
    {
        for (int i = 0; i<= SIZE;i++)
        {
            System.out.print(i +" ");
        }

        System.out.println();

        for (int i =0; i< SIZE; i++)
        {
            System.out.print((i+1) + " ");
            for (int j = 0; j< map[i].length; j++)
            {
                System.out.print(map[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    static boolean isCellValid(int x, int y) //метод, проверяющий правильно ли введены координаты и пустая ли клетка
    {
        if (x<0 || y<0 || x>=SIZE || y>= SIZE)
        {
            System.out.println("Вы не можете занять эту клетку");
            return false;
        }
        else if (map[y][x] ==  DOT_O)
        {
            System.out.println("Вы не можете занять эту клетку");
            return false;
        }
        else if (map[y][x] ==  DOT_X)
        {
            System.out.println("Вы не можете занять эту клетку");
            return false;
        }
        else
            {
                return true;
            }
    }
    static void playerTurn() //ход игрока
    {
        int x;
        int y;
        Scanner scanner = new Scanner(System.in);
        do
            {
                System.out.println("Введите координаты в формате X и Y");
                x = scanner.nextInt() - 1;
                y = scanner.nextInt() - 1;

            }
        while (!isCellValid(x,y));
        if (playersFigure == 1)
            {
                map[x][y] = DOT_X;
            }
        else
            {
                map[x][y] = DOT_O;
            }
    }
    static void AI_Turn()
    {
        int x;
        int y;
        Random random = new Random();
        System.out.println("Ход компьютера");
        do
            {
                x = random.nextInt(SIZE);
                y = random.nextInt(SIZE);
            }
        while(!isCellValid(x,y));
        System.out.println("Компьютер сходил в точку: "+ (x+1) + " " + (y+1));
        if (playersFigure == 1)
            {
                map[x][y] = DOT_O;
            }
        else
            {
                map[x][y] = DOT_X;
            }
    }
    static boolean hasWin(char symb)
    {
        if(map[0][0] == symb && map[0][1] == symb && map[0][2] == symb) return true;
        if(map[1][0] == symb && map[1][1] == symb && map[1][2] == symb) return true;
        if(map[2][0] == symb && map[2][1] == symb && map[2][2] == symb) return true;
        if(map[0][0] == symb && map[1][0] == symb && map[2][0] == symb) return true;
        if(map[0][1] == symb && map[1][1] == symb && map[2][1] == symb) return true;
        if(map[0][2] == symb && map[1][2] == symb && map[2][2] == symb) return true;
        if(map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) return true;
        if(map[2][0] == symb && map[1][1] == symb && map[0][2] == symb) return true;
        return false;
    }
    static boolean isMapFull()
    {
        for (int i = 0; i < SIZE; i++)
        {
            for (int j = 0; j < SIZE; j++)
            {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }
    static char mainMenu()
    {   char figureFinal;
        int playersFigure;
        System.out.println("Выберите фишку:");
        System.out.println("1) Крестик");
        System.out.println("2) Нолик");
        Scanner scanner = new Scanner(System.in);
        playersFigure = scanner.nextInt();
        if (playersFigure ==1)
        {
            figureFinal =DOT_X;
        }
        else if (playersFigure ==2)
        {
           figureFinal = DOT_O;
        }
        else
            {
                figureFinal = 0;
                System.out.println("Вы ввели не то число");
            }
                return figureFinal;

    }












}
