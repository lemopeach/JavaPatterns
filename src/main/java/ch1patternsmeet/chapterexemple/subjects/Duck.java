package ch1patternsmeet.chapterexemple.subjects;

import ch1patternsmeet.chapterexemple.behavior.fly.FlyBehavior;
import ch1patternsmeet.chapterexemple.behavior.quack.QuackBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;

    QuackBehavior quackBehavior;

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void setFlyBehavior (FlyBehavior fb){
        flyBehavior = fb;
    }

    public void setQuackBehavior (QuackBehavior qb){
        quackBehavior = qb;
    }
    public void swim(){
        System.out.println("Метод для заплыва!");
    };

    public abstract void display();
}
