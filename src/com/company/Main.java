package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Animal[] animals = {new Eagle(), new Shark(), new Turtle()};

        for (Animal i: animals) {
            if (i instanceof Eagle)
                ((Eagle) i).fly();
            else if (i instanceof Shark)
                ((Shark) i).attack();
            else if (i instanceof Turtle)
                ((Turtle) i).swim();
        }

        Eagle[] eagles = new Eagle[animals.length];
        Shark[] sharks = new Shark[animals.length];
        Turtle[] turtles = new Turtle[animals.length];

        int eaglesCount = 0;
        int sharksCount = 0;
        int turtlesCount = 0;

        for (Animal i: animals){
            if (i instanceof Eagle) {
                eagles[eaglesCount] = new Eagle();
                eaglesCount++;
            }
            else if (i instanceof Shark) {
                sharks[sharksCount] = new Shark();
                sharksCount++;
            }
            else if (i instanceof Turtle) {
                turtles[turtlesCount] = new Turtle();
                turtlesCount++;
            }
        }
        System.out.println("The eagles array: " + Arrays.toString(eagles));
        System.out.println("The sharks array: " + Arrays.toString(sharks));
        System.out.println("The turtles array: " + Arrays.toString(turtles));
    }
}
