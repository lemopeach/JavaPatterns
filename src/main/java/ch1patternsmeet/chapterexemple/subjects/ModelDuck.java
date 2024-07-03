package ch1patternsmeet.chapterexemple.subjects;

import ch1patternsmeet.chapterexemple.behavior.fly.FlyNoWay;
import ch1patternsmeet.chapterexemple.behavior.quack.Quack;

public class ModelDuck extends Duck {

    @Override
    public void display(){
        System.out.println("Я модель!");
    }

    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
}
