package ch1patternsmeet.myownexample.behavior;

import ch1patternsmeet.myownexample.Animal;
import ch1patternsmeet.myownexample.Cats;
import ch1patternsmeet.myownexample.Fishes;
import ch1patternsmeet.myownexample.behavior.fly.FlyNoWay;

public class Main {
    public static void main(String[] args) {

        Animal cat = new Cats();

        cat.display();
        cat.performFly();
        cat.performSwim();
        cat.performYourDreams("мышах!");

        cat.setFlyBehavior(new FlyNoWay());
        cat.performFly();
        cat.performYourDreams("мышках!");

        Fishes fish = new Fishes();

        fish.display();
        fish.performFly();
        fish.performSwim();
        fish.performYourDreams("спокойном океане!");
        System.out.println(fish.howManyBubblesInTotal);
        System.out.println(fish.howManyTimesTheyMakesBubbles);
        fish.makeBubbles(10);
        System.out.println(fish.howManyBubblesInTotal);
        System.out.println(fish.howManyTimesTheyMakesBubbles);

        Fishes nextfish = new Fishes();

        System.out.println(nextfish.howManyBubblesInTotal);
        System.out.println(nextfish.howManyTimesTheyMakesBubbles);
        nextfish.makeBubbles(57);
        System.out.println(nextfish.howManyBubblesInTotal);
        System.out.println(nextfish.howManyTimesTheyMakesBubbles);

    }
}
