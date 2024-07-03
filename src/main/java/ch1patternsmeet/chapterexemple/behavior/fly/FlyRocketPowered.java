package ch1patternsmeet.chapterexemple.behavior.fly;

public class FlyRocketPowered implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("А я вот на ракете летаю!");
    }
}
