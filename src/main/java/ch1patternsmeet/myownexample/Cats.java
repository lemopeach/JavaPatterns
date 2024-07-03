package ch1patternsmeet.myownexample;

import ch1patternsmeet.myownexample.behavior.fly.FlyInDreams;
import ch1patternsmeet.myownexample.behavior.swim.SwimNoWay;

public class Cats extends Animal{

    @Override
    public void display() {
        System.out.println("Я выгляжу как кошочка!");
    }

    public Cats(){
        flyBehavior = new FlyInDreams();
        swimBehavior = new SwimNoWay();
    }
}
