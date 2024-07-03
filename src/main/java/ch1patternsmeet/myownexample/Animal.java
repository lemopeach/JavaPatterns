package ch1patternsmeet.myownexample;

import ch1patternsmeet.myownexample.behavior.fly.FlyBehavior;
import ch1patternsmeet.myownexample.behavior.swim.SwimBehavior;

public abstract class Animal {

    FlyBehavior flyBehavior;
    SwimBehavior swimBehavior;

    public void performFly(){
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }

    public void setSwimBehavior(SwimBehavior sb){
        swimBehavior = sb;
    }

    public void performSwim(){
        swimBehavior.swim();
    }

    public void performYourDreams(String dream){
        flyBehavior.yourDreams(dream);
    }

    public void useOxigen(){
        System.out.println("Я дышу :)");
    }

    public abstract void display ();
}
