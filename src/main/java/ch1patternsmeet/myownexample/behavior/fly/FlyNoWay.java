package ch1patternsmeet.myownexample.behavior.fly;

public class FlyNoWay implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("А я не летаю.");
    }

    @Override
    public void yourDreams(String dream){
    }
}
