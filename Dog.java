package ru.GeekBrains;

public class Dog extends Animals
{
    public String colour = "Белый";
    public int age = 5;
    boolean checking;

    @Override
    public void jump()
    {
        float maxJump = (float) 0.5;
        int dogsJump = 1;
        if (dogsJump < maxJump)
        {
            checking = true;
            System.out.println("Собака прыгнула на расстояние: " + dogsJump);
            System.out.println(checking);
        }
        else
            {
                checking = false;
                System.out.println("Собака не смогла прыгнуть, слишком высоко");
                System.out.println(checking);
            }

    }
    @Override
    public void run()
    {
        int maxRunLength = 500;
        int runDog = 350;
        if (runDog<= maxRunLength)
        {
            checking = true;
            System.out.println("Собакен пробежал " + runDog +" метров");
            System.out.println(checking);
        }
        else
        {
            checking = false;
            System.out.println("Пёс не может пробежать столько, он слишком ленив");
            System.out.println(checking);
        }
    }
    @Override
    public void swim()
    {
        int maxSwimLength = 10;
        int dogsSwimLength = 11;
        if (dogsSwimLength<= maxSwimLength)
        {
            checking = true;
            System.out.println("Собакен проплыл " + dogsSwimLength + "метров, он молодец");
            System.out.println(checking);
        }
        else
            {   checking = false;
                System.out.println("Слишком большое расстояние для пса, чтобы проплыть(( ");
                System.out.println(checking);
            }

    }

    @Override
    public void swim(String colour, int age)
    {
        int maxSwimLength = 1000;
        int dogsSwimLength = 999;
        if (dogsSwimLength<=maxSwimLength)
        {
            checking = true;
            System.out.println(colour + " собакен проплыл "+ dogsSwimLength + " метров");
            System.out.println(checking);
        }
        else
            {
                checking = false;
                System.out.println(colour + " собакен не смог столько проплыть((");
                System.out.println(checking);
            }

    }

}