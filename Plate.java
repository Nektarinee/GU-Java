package ru.GeekBrains;

public class Plate
{
    private int food;

    public Plate(int food)
    {
        this.food = food;
    }

    public static void increaseFood(int food)
    {
        food += 50;
    }

    public void decreaseFood(int appetite)
    {
        if (!hasEnoughFood(appetite))
        {
            System.out.println("Нужен новый корм");
            return;
        }

        food = food - appetite;
    }

    public boolean hasEnoughFood(int appetite)
    {
        return appetite <= food;
    }
}
