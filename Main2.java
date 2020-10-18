package ru.GeekBrains;

public class Main
{
    public static void main(String[] args)
    {

            Cat[] cats = new Cat[3];
            cats[0] = new Cat("Dusya", 11);
            cats[1] = new Cat("Murzik", 14);
            cats[2] = new Cat("Belka", 10);

            Plate plate = new Plate(10);

            for (int cat = 0; cat < cats.length; cat++)
            {
                cats[cat].eat(plate);
            }
            if (isFull = false)
            {
            appendFoodTo(plate, 50);
            }

        for (int cat = 0; cat < cats.length; cat++)
        {
            cats[cat].eat(plate);
        }


    }
    static void appendFoodTo(Plate plate, int food)
    {
        Plate.increaseFood(food);
    }
}
