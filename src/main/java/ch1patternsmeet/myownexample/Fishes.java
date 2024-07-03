package ch1patternsmeet.myownexample;

import ch1patternsmeet.myownexample.behavior.fly.FlyWithRocket;
import ch1patternsmeet.myownexample.behavior.swim.SwimWithFins;

public class Fishes extends Animal{

    public static int howManyBubblesInTotal = 0;
    public static int howManyTimesTheyMakesBubbles = 0;

    @Override
    public void display() {
        System.out.println("О, я рыба и я булькаю! И выгляжу как рыба!");
    }

    public void makeBubbles(int howMuch){
        System.out.println("Буль-буль! Вот вам "+howMuch+" пузырьков!");
        howManyBubblesInTotal = howManyBubblesInTotal + howMuch;
        howManyTimesTheyMakesBubbles = howManyTimesTheyMakesBubbles + 1;
    }

    public Fishes(){
        flyBehavior = new FlyWithRocket();
        swimBehavior = new SwimWithFins();
    }
}
