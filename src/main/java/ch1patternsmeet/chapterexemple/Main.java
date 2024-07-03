package ch1patternsmeet.chapterexemple;

import ch1patternsmeet.chapterexemple.subjects.Duck;
import ch1patternsmeet.chapterexemple.subjects.MallardDuck;
import ch1patternsmeet.chapterexemple.subjects.ModelDuck;
import ch1patternsmeet.chapterexemple.behavior.fly.FlyNoWay;
import ch1patternsmeet.chapterexemple.behavior.fly.FlyRocketPowered;
import ch1patternsmeet.chapterexemple.behavior.quack.Squeak;

public class Main {
    public static void main(String[] args) {

        Duck duck = new MallardDuck();

        duck.setFlyBehavior(new FlyNoWay());
        duck.setQuackBehavior(new Squeak());

        duck.performFly();
        duck.performQuack();
        duck.swim();
        duck.display();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
