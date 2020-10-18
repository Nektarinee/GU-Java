package ru.GeekBrains;

public class Cat
{


    private String name;

    public boolean isFull;
    private int appetite;

    public Cat(String name, int appetite)
    {
        this.name = name;
        this.appetite = appetite;
         isFull = false;
    }

    public void eat(Plate plate)
    {

        if (plate.hasEnoughFood(appetite) && !isFull)
        {
            plate.decreaseFood(appetite);
            isFull = true;
            System.out.println(name + " наелся");
        }
        else if (isFull)
        {
            System.out.println(name + " не хочет кушать");
        }
        else
        {
            System.out.println("Нужно больше еды для " + name);
        }
    }

}
