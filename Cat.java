package ru.GeekBrains;

public class Cat extends Animals
{   boolean checking;
    @Override
    public void jump()
    {

        int maxJump = 2;
        int catsJump = 1;
        if (catsJump <= maxJump)
        {
            checking = true;
            System.out.println("Кот прыгнул в высоту на " + catsJump + "метра");
            System.out.println(checking);
        }
        else
            {
                checking = false;
                System.out.println("Кот не смог прыгнуть, слишком высоко");
                System.out.println(checking);
            }

    }
    @Override
    public void run()
    {
        int maxRunLength = 200;
        int runCat = 150;
        if (runCat<= maxRunLength)
        {
            checking = true;
            System.out.println("Кот пробежал " + runCat +"метров");
            System.out.println(checking);
        }
        else
            {
                checking = false;
                System.out.println("Кот понял,что не сможет столько пробежать и ушёл спать");
                System.out.println(checking);
            }
    }
    @Override
    public void swim()
    {
        System.out.println("Кот не умеет плавать!");
    }
}
