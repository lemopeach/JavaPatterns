package ch1patternsmeet.myownexample.behavior.fly;

public class FlyWithRocket implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("Летаю ракетами первого класса!");
    }

    @Override
    public void yourDreams(String dream){
    }
}
