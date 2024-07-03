package ch1patternsmeet.chapterexemple.behavior.fly;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly(){
        System.out.println("Я не летаю!");
    }
}
